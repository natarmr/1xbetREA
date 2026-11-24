.class public final La/gu70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/sip/SipManager;

.field public final b:Ljava/lang/String;

.field public final c:La/n6k0;

.field public final d:Landroid/app/PendingIntent;

.field public e:Landroid/net/sip/SipProfile;

.field public f:Landroid/net/sip/SipAudioCall;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:La/xiz;

.field public l:La/xiz;

.field public m:La/xiz;

.field public n:La/xiz;

.field public o:La/xiz;

.field public p:La/xiz;

.field public q:La/xiz;

.field public final r:La/a8z;

.field public final s:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/net/sip/SipManager;Ljava/lang/String;La/n6k0;Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/gu70;->a:Landroid/net/sip/SipManager;

    .line 17
    .line 18
    iput-object p2, p0, La/gu70;->b:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, La/gu70;->c:La/n6k0;

    .line 21
    .line 22
    iput-object p4, p0, La/gu70;->d:Landroid/app/PendingIntent;

    .line 23
    .line 24
    new-instance p1, La/du70;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p1, p0, p2}, La/du70;-><init>(La/gu70;B)V

    .line 28
    .line 29
    .line 30
    sget-object p2, La/wez;->b:La/wez;

    .line 31
    .line 32
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/gu70;->r:La/a8z;

    .line 37
    .line 38
    new-instance p1, La/du70;

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-direct {p1, p0, p2}, La/du70;-><init>(La/gu70;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/gu70;->s:La/n0o0;

    .line 49
    .line 50
    return-void
.end method

.method public static b(Landroid/net/sip/SipProfile;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, La/bzu;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/bzu;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getProfileName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, ""

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    const-string v3, "profile.profileName"

    .line 18
    .line 19
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getUriString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    move-object v1, v2

    .line 29
    :cond_1
    const-string v3, "profile.uriString"

    .line 30
    .line 31
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getAuthUserName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :cond_2
    const-string v3, "profile.authUserName"

    .line 42
    .line 43
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getDisplayName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    move-object v1, v2

    .line 53
    :cond_3
    const-string v3, "profile.displayName"

    .line 54
    .line 55
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getPort()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v3, "profile.port"

    .line 67
    .line 68
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getProtocol()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_4
    const-string v3, "profile.protocol"

    .line 79
    .line 80
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getUserName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    move-object v1, v2

    .line 90
    :cond_5
    const-string v3, "profile.userName"

    .line 91
    .line 92
    invoke-static {v0, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/net/sip/SipProfile;->getSipDomain()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-nez p0, :cond_6

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    move-object v2, p0

    .line 103
    :goto_0
    const-string p0, "profile.sipDomain"

    .line 104
    .line 105
    invoke-static {v0, p0, v2}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, La/bzu;->a()La/edy;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, La/edy;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/gu70;->e:Landroid/net/sip/SipProfile;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, La/gu70;->a:Landroid/net/sip/SipManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/net/sip/SipProfile;->getUriString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v1, v0}, Landroid/net/sip/SipManager;->close(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const-string v1, "error - "

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, La/gu70;->c:La/n6k0;

    .line 32
    .line 33
    const-string v1, "errorCloseCall"

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    :goto_0
    return-void
.end method
