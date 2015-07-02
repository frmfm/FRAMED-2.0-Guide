# 0. Introduction

FRAMED offers a number of different ways to submit your artworks to the platform. From applications for Windows (.exe) to web pages, it has never been easier to share and collect digital art. 

This document is designed to inform you on the basic technical specifications for creating an artwork, as well as the flow of listing and selling your content via FRAMED. When creating and selling artwork on FRAMED, please make sure to read this guide carefully.

## Step 1. Artwork Development & Testing

Artist will be responsible for the actual development of the artwork. The artwork can be of any type and category, including but not limited to Video/Graphic/Interactive. When the artwork has been developed, please submit your files via the online upload feature on the FRAMED website. Our team will test your artwork on the actual device, and will report back if there are any issues with your artwork. Testing and reporting phase will continue until the artwork is optimized.

## Step 2. Artwork/Artist Information

When artwork testing/debug/optimization has been completed, your artwork will be submitted to the platform and you will receive a notification stating that your artwork is now available on FRAMED.

## Step 3. Artwork License Contract/Pricing & Editions

Before the artwork is listed and released to the public, the Artwork licensing contract will be signed. Also, price of the artwork and the number of release issues/editions will be determined. These details are set by the artist during the upload process.

## Step 4. Artwork Launch/Sale Begins

After all the information has been received and artwork has been tested, the artwork will be released to the public to begin sales on the FRAMED GALLERY. Updates will be released through the FRAMED Website and News Release. Artist will be able to check the current sales status through our website. As per the license contract, proceeds of the artwork sales will be distributed every three months.

# 1. Artwork Development


## 1-1. FRAMED Summary

• FRAMED is based on Windows 8 OS. Any work playable on a Windows 8 PC with equal specifications listed below will be able to play on the FRAMED device.

• FRAMED 2.0 Specification:

1. 24-inch = 21” x 12.4”, 8.8lb. (533 x 317, 4kg) 
2. 40-inch = 38” x 21.6”, 26.5lb. (976 x 550, 12kg) 
3. 55-inch = 50” x 29”, 77lb. (1270 x 741, 35kg)

- Intel(R) Atom(TM) CPU Z3370 @ 1.46Ghz (spec)
- Intel HD Graphics (integrated) / Intel HD Gen 7
- Installed Memory (RAM) 2.00Gb
- System Type: 32-bit Windows Embedded 8 Operating System, x64-based processor
- Storage: 64 GB eMMC
- Current Mode: 1080 x 1920 (32 bit) (59Hz)
- Display Memory: 1513 MB
- Speakers (Intel SST Audio Device (WDM))
- Microphone (Intel SST Audio Device (WDM))
- HD Camera 720p

• All artworks will be displayed at W1080*H1920 pixel in full screen.

• Artworks can also optionally include the use of webcam/mic that are embedded on the device.

• As the device will be always connected to the internet, artists are also free to use the web as an additional input source for the artwork.

• FRAMED also supports playback of artworks from the web but if you wish to  sell web based artworks you need to follow the official submission feature. 

## 1-2. Still Artworks

For artists who work with the still/GIF image media, our system will package and release the submitted photo data into a playable artwork.

### ■ Resolution

The artwork will be displayed at W1080 * H1920 Full HD format. Any work created at a lower resolution will be stretched. FRAMED also supports landscape format and this option is included during the upload.

## 1-3. Video Artworks

For artists who work with the video media, our system will package and release the submitted video/photo data into a playable application.

### ■ Resolution

The artwork will be displayed at W1080 * H1920 Full HD format. Any work created at a lower resolution will be stretched. FRAMED also supports landscape videos and this option is included during the upload.

### ■ Frame Rate

The highest frame rate is 30FPS.

### ■ Playback Format

The basic format for playing back the artwork is the “infinity loop.” However, there are other ways to program the artwork for different playback formats if they are packaged as applications (see guides for other frameworks below). For example:

• Randomly selecting sections

• Time/Clock based (content changes according to the time of day)

• Interactive playback (content changes according to environment, i.e. sound and/or human presence)

### ■ Submission of Artwork

• For video artwork, please submit the data as a Quicktime (.mov).

• Please encode in H.264, unless otherwise specified.

• If the artwork requires special or unique playback format, we may additionally request other versions such as uncompressed data.

## 1-4.Application(EXE) Artworks

## 1-5.Flash(SWF) Artworks

This section is for artworks developed in Flash. Please review the instructions below, and submit your work in the specified format. Our development team will review and test your artwork.

### ■ Resolution

• The screen will display at W1080*H1920 pixels resolution. Please be aware of this resolution when developing your artwork.

• Hardware Scaling (scaling through hardware) function is enabled. Use this option to optimize the performance if there is trouble achieving reasonable frame rate.

### ■ Frame Rate

• Artworks can be played at any specified frame rate.

• Depending on the CPU load, the frame rate may drop. To make the testing process easier, please include a debug option to display the FPS where possible.

### ■ Hardware Acceleration

• Hardware Acceleration in Flash is enabled at default. Functions such as Stage3D that uses GPU power is also available http://www.macromedia.com/support/documentation/en/flashplayer/help/help01.html.

• However, there have been reports of bugs caused when Hardware Acceleration is enabled. If this is the case, Hardware Acceleration can be explicitly turned off.

### ■ Continuous Playback Time

• Any artwork application on FRAMED will be exposed to being played at maximum 24 hours for continuous playback (the device is programmed to automatically restart once a day). Please test to make sure that the artwork can be played continuously for 24 hours before submission.

• Please debug and optimize the artwork as much as possible, being careful of memory leakage.

• If we detect any malfunctions after the artwork has been released to the public, the artist will be responsible for modifying/updating the artwork as per the license contract. Please review the details the article 4-1 of the contract.

### ■ Artwork Submission

• Please submit all files listed below in one folder .zip file (in the root, no subfolders except for other related project files):

	• Projector file (main.exe) for Windows startup

	• All other related files (SWF/text/images/sound)

• Specify file locations as relative paths.

• Do not include fullscreen commands (fscommand (“fullscreen”, “true”). This will be done automatically on the FRAMED device.

### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.

• Access to the camera/mic from the flash player is enabled at default, and doesn’t require additional settings.

## 1-6.OpenFrameworks Artworks

## 1-7.Processing Artworks

## 1-8.VVVV Artworks

## 1-9.Cinder Artworks

## 1-10.MaxMSP Artworks

## 1-11.Web(Javascript) Artworks




## 2.Artist/Artwork Information (Upload Form)

- Artworks for Sale
	- Artists guides
	- Gallery guides
	- Organisation guides
	- Developer guides
	- Exhibition guide
	- Specification
	- Licence agreement

- Artworks on the Web
	- Feed
	- File formats
	- URLS