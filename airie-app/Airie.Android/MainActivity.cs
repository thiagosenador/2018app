using System;
using Android.App;
using Android.OS;
using Android.Widget;

namespace Airie.Android
{
    [Activity(Label = "Airie.Android", MainLauncher = true)]
    public class MainActivity : Activity
    {
        private TextView apiResponse;
        private Button apiButton;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            apiResponse = this.FindViewById<TextView>(Resource.Id.apiResponseText);

            apiButton = this.FindViewById<Button>(Resource.Id.apiButton);
            apiButton.Click += OnApiButtonClicked;
        }

        private void OnApiButtonClicked(object sender, EventArgs e)
        {
            apiResponse.Text = "thiago";
        }
    }
}