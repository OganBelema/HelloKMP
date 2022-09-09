import SwiftUI

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
            ContentView(viewmodel: ContentView.ViewModel())
		}
	}
}
