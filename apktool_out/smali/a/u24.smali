.class public final La/u24;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/media/AudioManager;

.field public b:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(La/us00;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "audio"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p1, Landroid/media/AudioManager;

    .line 14
    .line 15
    iput-object p1, p0, La/u24;->a:Landroid/media/AudioManager;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, La/u24;->a:Landroid/media/AudioManager;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->setMode(I)V

    .line 5
    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x1a

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-lt v0, v2, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Landroid/media/AudioFocusRequest$Builder;

    .line 36
    .line 37
    invoke-direct {v2, v3}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/u24;->b:Landroid/media/AudioFocusRequest;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const/4 p0, 0x0

    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {v1, p0, v0, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 60
    .line 61
    .line 62
    return-void
.end method
