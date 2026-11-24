.class public final La/trm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cfr;
.implements La/ngw0;
.implements La/nmw0;
.implements La/bfr;
.implements La/r2x0;
.implements La/v8x0;


# static fields
.field public static d:La/trm0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/trm0;->a:B

    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance p1, La/j6m0;

    const/16 v0, 0x9

    .line 134
    invoke-direct {p1, v0}, La/j6m0;-><init>(B)V

    .line 135
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 136
    new-instance p1, La/dj10;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, La/dj10;-><init>(I)V

    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void

    .line 137
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 139
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    move-result-object v0

    .line 140
    iput-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 141
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    move-result-object p1

    .line 142
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void

    .line 143
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance p1, La/nuj0;

    .line 145
    invoke-direct {p1, v0}, La/nuj0;-><init>(I)V

    .line 146
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 147
    new-instance p1, La/u710;

    const/4 v0, 0x0

    .line 148
    invoke-direct {p1, v0}, La/u710;-><init>(Ljava/lang/Object;)V

    .line 149
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/dpi0;La/btt0;)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/trm0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 124
    iput-object p2, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/trm0;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sparse-switch p2, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, La/nxo0;

    .line 15
    .line 16
    const/16 p2, 0xb

    .line 17
    .line 18
    invoke-direct {p1, p0, p2}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance p1, La/rbt0;

    .line 30
    .line 31
    const/16 p2, 0x1c

    .line 32
    .line 33
    invoke-direct {p1, p0, p2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p1, La/rbt0;

    .line 45
    .line 46
    const/16 p2, 0x12

    .line 47
    .line 48
    invoke-direct {p1, p0, p2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    return-void

    .line 54
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance p1, La/rbt0;

    .line 60
    .line 61
    const/4 p2, 0x2

    .line 62
    invoke-direct {p1, p0, p2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    return-void

    .line 68
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p1, La/qir0;

    .line 74
    .line 75
    const/16 p2, 0x11

    .line 76
    .line 77
    invoke-direct {p1, p0, p2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    return-void

    .line 83
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance p1, La/h3q0;

    .line 89
    .line 90
    const/16 p2, 0x17

    .line 91
    .line 92
    invoke-direct {p1, p0, p2}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_4
        0x7 -> :sswitch_3
        0x9 -> :sswitch_2
        0xd -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/h0q0;La/rrc;La/bzs0;La/sxs0;)V
    .locals 0

    const/16 p3, 0x11

    iput-byte p3, p0, La/trm0;->a:B

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 104
    iput-object p2, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/h70;)V
    .locals 1

    const/16 v0, 0x17

    iput-byte v0, p0, La/trm0;->a:B

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 110
    :try_start_0
    const-string p1, "XDH"

    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    invoke-static {p1, v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 112
    invoke-static {p1, v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyAgreement;

    .line 113
    new-instance p1, La/r7v;

    invoke-direct {p1, v0}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 114
    invoke-virtual {p1}, La/r7v;->l()La/vow0;

    goto :goto_0

    .line 115
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Conscrypt is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :catch_0
    new-instance p1, La/zow0;

    const/16 v0, 0x1d

    .line 117
    invoke-direct {p1, v0}, La/zow0;-><init>(B)V

    .line 118
    :goto_0
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/hcp0;La/btt0;)V
    .locals 1

    const/16 v0, 0xe

    iput-byte v0, p0, La/trm0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 107
    iput-object p2, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/jdw0;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, La/trm0;->a:B

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/owp0;I)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/trm0;->a:B

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rrd;La/gst0;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/trm0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 121
    iput-object p2, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/u3a;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/trm0;->a:B

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/z7z;)V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, La/trm0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance v0, La/ws3;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, La/ws3;-><init>(La/z7z;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 128
    new-instance p1, La/jfm0;

    const/16 v0, 0x16

    invoke-direct {p1, p0, v0}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 99
    iput-byte p3, p0, La/trm0;->a:B

    iput-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/trm0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 100
    iput-byte p4, p0, La/trm0;->a:B

    iput-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/trm0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static q(Landroid/content/Context;Ljava/lang/String;)La/trm0;
    .locals 5

    .line 1
    sget-object v0, La/trm0;->d:La/trm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/trm0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    new-instance v0, La/trm0;

    .line 16
    .line 17
    :try_start_0
    invoke-static {}, La/mqw0;->a()V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1}, La/trm0;->t(Landroid/content/Context;Ljava/lang/String;)La/ok50;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_2

    .line 25
    :catch_0
    move-exception v1

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception v1

    .line 28
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "Exception encountered during crypto setup:\n"

    .line 33
    .line 34
    const-string v4, "FirebearStorageCryptoHelper"

    .line 35
    .line 36
    invoke-static {v3, v2, v4}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    instance-of v1, v1, Ljava/security/GeneralSecurityException;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const-string v1, "com.google.firebase.auth.api.crypto."

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "StorageCryptoKeyset"

    .line 59
    .line 60
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 65
    .line 66
    .line 67
    :try_start_1
    invoke-static {p0, p1}, La/trm0;->t(Landroid/content/Context;Ljava/lang/String;)La/ok50;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 71
    goto :goto_2

    .line 72
    :catch_2
    move-exception p0

    .line 73
    goto :goto_1

    .line 74
    :catch_3
    move-exception p0

    .line 75
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v1, "Exception encountered during second attempt to crypto setup:\n"

    .line 80
    .line 81
    invoke-static {v1, p0, v4}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    const/4 p0, 0x0

    .line 85
    :goto_2
    const/16 v1, 0x15

    .line 86
    .line 87
    invoke-direct {v0, p1, p0, v1}, La/trm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    sput-object v0, La/trm0;->d:La/trm0;

    .line 91
    .line 92
    :cond_2
    sget-object p0, La/trm0;->d:La/trm0;

    .line 93
    .line 94
    return-object p0
.end method

.method public static t(Landroid/content/Context;Ljava/lang/String;)La/ok50;
    .locals 3

    .line 1
    new-instance v0, La/sd60;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sd60;-><init>(B)V

    .line 6
    .line 7
    .line 8
    const-string v1, "com.google.firebase.auth.api.crypto."

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iput-object p0, v0, La/sd60;->b:Ljava/lang/Object;

    .line 18
    .line 19
    const-string p0, "StorageCryptoKeyset"

    .line 20
    .line 21
    iput-object p0, v0, La/sd60;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v1, v0, La/sd60;->d:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, La/pqw0;->b:La/bfx0;

    .line 26
    .line 27
    iput-object p0, v0, La/sd60;->h:Ljava/lang/Object;

    .line 28
    .line 29
    const-string p0, "android-keystore://firebear_main_key_id_for_storage_crypto."

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "android-keystore://"

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iput-object p0, v0, La/sd60;->e:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v0}, La/sd60;->u()La/ok50;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_0
    const-string p0, "key URI must start with android-keystore://"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_1
    const-string p0, "need an Android context"

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2
.end method


# virtual methods
.method public a(La/xcm0;La/u4w0;La/zje;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, La/trm0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/h0q0;

    .line 10
    .line 11
    iget-object v4, v0, La/trm0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, La/rrc;

    .line 14
    .line 15
    iget-object v4, v4, La/rrc;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/tgk;

    .line 18
    .line 19
    instance-of v5, v2, La/x8w0;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    move-object v5, v2

    .line 24
    check-cast v5, La/x8w0;

    .line 25
    .line 26
    iget v6, v5, La/x8w0;->p:I

    .line 27
    .line 28
    const/high16 v7, -0x80000000

    .line 29
    .line 30
    and-int v8, v6, v7

    .line 31
    .line 32
    if-eqz v8, :cond_0

    .line 33
    .line 34
    sub-int/2addr v6, v7

    .line 35
    iput v6, v5, La/x8w0;->p:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v5, La/x8w0;

    .line 39
    .line 40
    invoke-direct {v5, v0, v2}, La/x8w0;-><init>(La/trm0;La/zje;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, v5, La/x8w0;->n:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object v2, La/wne;->a:La/wne;

    .line 46
    .line 47
    iget v6, v5, La/x8w0;->p:I

    .line 48
    .line 49
    const-string v8, "AppGuid"

    .line 50
    .line 51
    const-string v9, "Time"

    .line 52
    .line 53
    const-string v10, "X-VersionOS"

    .line 54
    .line 55
    const/4 v13, 0x3

    .line 56
    const/4 v15, 0x2

    .line 57
    const-wide/16 v16, 0x3e8

    .line 58
    .line 59
    const/4 v11, 0x1

    .line 60
    const/4 v12, 0x0

    .line 61
    if-eqz v6, :cond_5

    .line 62
    .line 63
    if-eq v6, v11, :cond_3

    .line 64
    .line 65
    if-eq v6, v15, :cond_2

    .line 66
    .line 67
    if-ne v6, v13, :cond_1

    .line 68
    .line 69
    iget-object v1, v5, La/x8w0;->l:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v2, v5, La/x8w0;->k:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v12

    .line 84
    :cond_2
    iget-wide v6, v5, La/x8w0;->m:J

    .line 85
    .line 86
    iget-object v1, v5, La/x8w0;->k:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v4, v2

    .line 92
    move-object v2, v12

    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_3
    move-object/from16 p0, v12

    .line 96
    .line 97
    iget-wide v12, v5, La/x8w0;->m:J

    .line 98
    .line 99
    iget-object v1, v5, La/x8w0;->j:La/u4w0;

    .line 100
    .line 101
    iget-object v6, v5, La/x8w0;->i:La/xcm0;

    .line 102
    .line 103
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object/from16 v25, v4

    .line 107
    .line 108
    move-object v4, v2

    .line 109
    move-object v2, v6

    .line 110
    :cond_4
    move-wide v6, v12

    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_5
    move-object/from16 p0, v12

    .line 114
    .line 115
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {}, La/tgk;->i()V

    .line 141
    .line 142
    .line 143
    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 144
    .line 145
    const/16 v14, 0x2e

    .line 146
    .line 147
    invoke-static {v15, v14}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-eqz v14, :cond_6

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    const-string v14, ".0"

    .line 155
    .line 156
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    :goto_1
    iget v14, v1, La/u4w0;->a:I

    .line 161
    .line 162
    iget v11, v1, La/u4w0;->b:I

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, La/tgk;->h()I

    .line 168
    .line 169
    .line 170
    move-result v19

    .line 171
    iget-object v7, v1, La/u4w0;->c:Ljava/lang/String;

    .line 172
    .line 173
    move-object/from16 v21, v2

    .line 174
    .line 175
    move-object/from16 v20, v3

    .line 176
    .line 177
    iget-wide v2, v1, La/u4w0;->d:J

    .line 178
    .line 179
    div-long v22, v12, v16

    .line 180
    .line 181
    add-long v22, v22, v2

    .line 182
    .line 183
    iget-object v2, v1, La/u4w0;->e:Ljava/lang/String;

    .line 184
    .line 185
    iget v3, v1, La/u4w0;->f:I

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move/from16 v24, v3

    .line 197
    .line 198
    new-instance v3, La/bzu;

    .line 199
    .line 200
    move-object/from16 v25, v4

    .line 201
    .line 202
    const/16 v4, 0x13

    .line 203
    .line 204
    invoke-direct {v3, v4}, La/bzu;-><init>(B)V

    .line 205
    .line 206
    .line 207
    const-string v4, "X-DeviceManufacturer"

    .line 208
    .line 209
    invoke-static {v3, v4, v0}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v0, "X-DeviceModel"

    .line 213
    .line 214
    invoke-static {v3, v0, v6}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v0, "X-DeviceSystemVersion"

    .line 218
    .line 219
    invoke-static {v3, v0, v15}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v0, "X-Group"

    .line 223
    .line 224
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v3, v0, v4}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 229
    .line 230
    .line 231
    const-string v0, "X-Whence"

    .line 232
    .line 233
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v3, v0, v4}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 238
    .line 239
    .line 240
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v3, v10, v0}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 245
    .line 246
    .line 247
    const-string v0, "X-BundleId"

    .line 248
    .line 249
    invoke-static {v3, v0, v7}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v3, v9, v0}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v3, v8, v2}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v0, "X-Ref"

    .line 263
    .line 264
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-static {v3, v0, v2}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, La/bzu;->a()La/edy;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, La/edy;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object/from16 v2, p1

    .line 280
    .line 281
    iput-object v2, v5, La/x8w0;->i:La/xcm0;

    .line 282
    .line 283
    iput-object v1, v5, La/x8w0;->j:La/u4w0;

    .line 284
    .line 285
    iput-wide v12, v5, La/x8w0;->m:J

    .line 286
    .line 287
    const/4 v3, 0x1

    .line 288
    iput v3, v5, La/x8w0;->p:I

    .line 289
    .line 290
    move-object/from16 v3, v20

    .line 291
    .line 292
    invoke-virtual {v3, v0, v5}, La/h0q0;->i(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    move-object/from16 v4, v21

    .line 297
    .line 298
    if-ne v0, v4, :cond_4

    .line 299
    .line 300
    goto/16 :goto_5

    .line 301
    .line 302
    :goto_2
    check-cast v0, Ljava/lang/String;

    .line 303
    .line 304
    iget-wide v11, v1, La/u4w0;->d:J

    .line 305
    .line 306
    iget v13, v1, La/u4w0;->g:I

    .line 307
    .line 308
    div-long v14, v6, v16

    .line 309
    .line 310
    add-long/2addr v14, v11

    .line 311
    const-wide/16 v11, 0x5

    .line 312
    .line 313
    add-long/2addr v14, v11

    .line 314
    iget-object v11, v1, La/u4w0;->e:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    move/from16 v16, v13

    .line 321
    .line 322
    iget-object v13, v1, La/u4w0;->h:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-static {}, La/tgk;->h()I

    .line 328
    .line 329
    .line 330
    move-result v17

    .line 331
    mul-int v17, v17, v16

    .line 332
    .line 333
    move-wide/from16 p1, v14

    .line 334
    .line 335
    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v14

    .line 339
    new-instance v15, Lkotlin/ranges/IntRange;

    .line 340
    .line 341
    move-object/from16 v21, v4

    .line 342
    .line 343
    const/16 v4, 0x2710

    .line 344
    .line 345
    move-object/from16 v20, v3

    .line 346
    .line 347
    move-wide/from16 v16, v6

    .line 348
    .line 349
    const/4 v3, 0x0

    .line 350
    const/4 v6, 0x1

    .line 351
    invoke-direct {v15, v3, v4, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 352
    .line 353
    .line 354
    sget-object v3, La/f1e0;->a:La/e1e0;

    .line 355
    .line 356
    invoke-static {v15, v3}, La/l1e0;->j(Lkotlin/ranges/IntRange;La/e1e0;)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    iget-object v4, v1, La/u4w0;->i:Ljava/lang/String;

    .line 361
    .line 362
    iget-object v6, v1, La/u4w0;->j:Ljava/lang/String;

    .line 363
    .line 364
    iget-object v1, v1, La/u4w0;->k:Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v7, La/bzu;

    .line 382
    .line 383
    const/16 v15, 0x13

    .line 384
    .line 385
    invoke-direct {v7, v15}, La/bzu;-><init>(B)V

    .line 386
    .line 387
    .line 388
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    invoke-static {v7, v9, v15}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v7, v8, v11}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    const-string v8, "X-FCountry"

    .line 399
    .line 400
    invoke-static {v7, v8, v12}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const-string v8, "ApplicationVersion"

    .line 404
    .line 405
    invoke-static {v7, v8, v13}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v7, v10, v14}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    const-string v8, "Rnd"

    .line 412
    .line 413
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-static {v7, v8, v3}, La/cww;->F(La/bzu;Ljava/lang/String;Ljava/lang/Number;)V

    .line 418
    .line 419
    .line 420
    if-eqz v4, :cond_7

    .line 421
    .line 422
    const-string v3, "Rnd2"

    .line 423
    .line 424
    invoke-static {v7, v3, v4}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_7
    if-eqz v6, :cond_8

    .line 428
    .line 429
    const-string v3, "Rnd3"

    .line 430
    .line 431
    invoke-static {v7, v3, v6}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :cond_8
    if-eqz v1, :cond_9

    .line 435
    .line 436
    const-string v3, "Rnd4"

    .line 437
    .line 438
    invoke-static {v7, v3, v1}, La/cww;->G(La/bzu;Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :cond_9
    sget-object v1, La/t7w0;->a:La/t7w0;

    .line 442
    .line 443
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-nez v1, :cond_b

    .line 448
    .line 449
    sget-object v1, La/s7w0;->b:La/s7w0;

    .line 450
    .line 451
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    if-nez v1, :cond_b

    .line 456
    .line 457
    sget-object v1, La/s7w0;->c:La/s7w0;

    .line 458
    .line 459
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-nez v1, :cond_b

    .line 464
    .line 465
    sget-object v1, La/u7w0;->a:La/u7w0;

    .line 466
    .line 467
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    if-nez v1, :cond_b

    .line 472
    .line 473
    sget-object v1, La/s7w0;->a:La/s7w0;

    .line 474
    .line 475
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eqz v1, :cond_a

    .line 480
    .line 481
    goto :goto_3

    .line 482
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 483
    .line 484
    .line 485
    return-object p0

    .line 486
    :cond_b
    :goto_3
    invoke-virtual {v7}, La/bzu;->a()La/edy;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-virtual {v1}, La/edy;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    move-object/from16 v2, p0

    .line 495
    .line 496
    iput-object v2, v5, La/x8w0;->i:La/xcm0;

    .line 497
    .line 498
    iput-object v2, v5, La/x8w0;->j:La/u4w0;

    .line 499
    .line 500
    iput-object v0, v5, La/x8w0;->k:Ljava/lang/String;

    .line 501
    .line 502
    move-wide/from16 v12, v16

    .line 503
    .line 504
    iput-wide v12, v5, La/x8w0;->m:J

    .line 505
    .line 506
    const/4 v3, 0x2

    .line 507
    iput v3, v5, La/x8w0;->p:I

    .line 508
    .line 509
    move-object/from16 v3, v20

    .line 510
    .line 511
    invoke-virtual {v3, v1, v5}, La/h0q0;->f(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    move-object/from16 v4, v21

    .line 516
    .line 517
    if-ne v1, v4, :cond_c

    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_c
    move-object v6, v1

    .line 521
    move-object v1, v0

    .line 522
    move-object v0, v6

    .line 523
    move-wide v6, v12

    .line 524
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 525
    .line 526
    iput-object v2, v5, La/x8w0;->i:La/xcm0;

    .line 527
    .line 528
    iput-object v2, v5, La/x8w0;->j:La/u4w0;

    .line 529
    .line 530
    iput-object v1, v5, La/x8w0;->k:Ljava/lang/String;

    .line 531
    .line 532
    iput-object v0, v5, La/x8w0;->l:Ljava/lang/String;

    .line 533
    .line 534
    iput-wide v6, v5, La/x8w0;->m:J

    .line 535
    .line 536
    const/4 v2, 0x3

    .line 537
    iput v2, v5, La/x8w0;->p:I

    .line 538
    .line 539
    invoke-virtual {v3, v5}, La/h0q0;->e(La/zje;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    if-ne v2, v4, :cond_d

    .line 544
    .line 545
    :goto_5
    return-object v4

    .line 546
    :cond_d
    move-object/from16 v26, v1

    .line 547
    .line 548
    move-object v1, v0

    .line 549
    move-object v0, v2

    .line 550
    move-object/from16 v2, v26

    .line 551
    .line 552
    :goto_6
    check-cast v0, Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    new-instance v3, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const/16 v4, 0xb

    .line 566
    .line 567
    const/4 v5, 0x0

    .line 568
    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    const/16 v6, 0xa

    .line 587
    .line 588
    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const/16 v2, 0x5f

    .line 596
    .line 597
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    invoke-virtual {v1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    new-instance v2, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    array-length v1, v0

    .line 628
    move v14, v5

    .line 629
    :goto_7
    if-ge v14, v1, :cond_f

    .line 630
    .line 631
    aget-char v3, v0, v14

    .line 632
    .line 633
    add-int/lit8 v4, v5, 0x1

    .line 634
    .line 635
    mul-int/lit8 v6, v5, 0x2

    .line 636
    .line 637
    const/16 v18, 0x1

    .line 638
    .line 639
    add-int/lit8 v6, v6, 0x1

    .line 640
    .line 641
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v7

    .line 645
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    if-lt v7, v5, :cond_e

    .line 650
    .line 651
    invoke-virtual {v2, v6, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    :cond_e
    add-int/lit8 v14, v14, 0x1

    .line 655
    .line 656
    move v5, v4

    .line 657
    goto :goto_7

    .line 658
    :cond_f
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    return-object v0
.end method

.method public b(La/h0q0;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p1, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    sget-object v1, La/n9x0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sget-object v6, La/n9x0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    add-int/lit8 v8, v8, 0xf

    .line 62
    .line 63
    add-int/2addr v8, v9

    .line 64
    new-instance v9, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    add-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    add-int/2addr v8, v10

    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    add-int/2addr v8, v11

    .line 72
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const-string v8, ".mobstore_tmp-"

    .line 76
    .line 77
    const-string v10, "-"

    .line 78
    .line 79
    invoke-static {v9, v8, v1, v10}, La/rw2;->x(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v9, v10, v4, v5, v10}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, p1, La/h0q0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, La/p9x0;

    .line 122
    .line 123
    invoke-interface {v2, v1}, La/p9x0;->b(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-instance v4, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    iget-object v5, p1, La/h0q0;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v7, 0x0

    .line 144
    if-nez v6, :cond_2

    .line 145
    .line 146
    sget v6, La/u8x0;->b:I

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-nez v8, :cond_1

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_0

    .line 168
    .line 169
    new-instance v5, La/u8x0;

    .line 170
    .line 171
    invoke-direct {v5, v3, v6}, La/u8x0;-><init>(Ljava/io/OutputStream;Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_0
    move-object v5, v7

    .line 176
    :goto_0
    if-eqz v5, :cond_2

    .line 177
    .line 178
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_1
    invoke-static {v5}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    throw p0

    .line 187
    :cond_2
    :goto_1
    iget-object p1, p1, La/h0q0;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p1, La/b4x;

    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-nez v3, :cond_3

    .line 200
    .line 201
    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-eqz p1, :cond_b

    .line 210
    .line 211
    invoke-static {}, La/hny;->b()V

    .line 212
    .line 213
    .line 214
    move-object v4, v7

    .line 215
    :goto_2
    iget-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p1, [La/hcp0;

    .line 218
    .line 219
    const/4 v3, 0x0

    .line 220
    if-eqz p1, :cond_4

    .line 221
    .line 222
    aget-object p1, p1, v3

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {v4}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Ljava/io/OutputStream;

    .line 232
    .line 233
    instance-of v6, v5, La/i9x0;

    .line 234
    .line 235
    if-eqz v6, :cond_4

    .line 236
    .line 237
    check-cast v5, La/i9x0;

    .line 238
    .line 239
    iput-object v5, p1, La/hcp0;->c:Ljava/lang/Object;

    .line 240
    .line 241
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    check-cast v5, Ljava/io/OutputStream;

    .line 246
    .line 247
    iput-object v5, p1, La/hcp0;->b:Ljava/lang/Object;

    .line 248
    .line 249
    :cond_4
    :try_start_0
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    .line 255
    :try_start_1
    iget-object v4, p0, La/trm0;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v4, La/jdw0;

    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    check-cast v4, La/mew0;

    .line 263
    .line 264
    invoke-virtual {v4}, La/mew0;->k()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    sget-boolean v6, La/aew0;->b:Z

    .line 269
    .line 270
    const/16 v6, 0x1000

    .line 271
    .line 272
    if-le v5, v6, :cond_5

    .line 273
    .line 274
    move v5, v6

    .line 275
    :cond_5
    new-instance v6, La/wdw0;

    .line 276
    .line 277
    invoke-direct {v6, p1, v5}, La/wdw0;-><init>(Ljava/io/OutputStream;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4, v6}, La/mew0;->d(La/aew0;)V

    .line 281
    .line 282
    .line 283
    iget v4, v6, La/wdw0;->e:I

    .line 284
    .line 285
    if-lez v4, :cond_6

    .line 286
    .line 287
    invoke-virtual {v6}, La/wdw0;->B()V

    .line 288
    .line 289
    .line 290
    :cond_6
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, [La/hcp0;

    .line 293
    .line 294
    if-eqz p0, :cond_8

    .line 295
    .line 296
    aget-object p0, p0, v3

    .line 297
    .line 298
    iget-object v3, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, La/i9x0;

    .line 301
    .line 302
    if-eqz v3, :cond_7

    .line 303
    .line 304
    iget-object v3, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v3, Ljava/io/OutputStream;

    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 309
    .line 310
    .line 311
    iget-object p0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast p0, La/i9x0;

    .line 314
    .line 315
    iget-object p0, p0, La/i9x0;->a:Ljava/io/FileOutputStream;

    .line 316
    .line 317
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-virtual {p0}, Ljava/io/FileDescriptor;->sync()V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_7
    new-instance p0, La/l52;

    .line 326
    .line 327
    const-string v0, "Cannot sync underlying stream"

    .line 328
    .line 329
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 333
    :catchall_0
    move-exception p0

    .line 334
    goto :goto_4

    .line 335
    :cond_8
    :goto_3
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 336
    .line 337
    .line 338
    invoke-interface {v2, v1, v0}, La/p9x0;->d(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 339
    .line 340
    .line 341
    return-object v7

    .line 342
    :catch_0
    move-exception p0

    .line 343
    goto :goto_6

    .line 344
    :goto_4
    if-eqz p1, :cond_9

    .line 345
    .line 346
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :catchall_1
    move-exception p1

    .line 351
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    :cond_9
    :goto_5
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 355
    :goto_6
    :try_start_5
    invoke-interface {v2, v1}, La/p9x0;->c(Landroid/net/Uri;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1

    .line 356
    .line 357
    .line 358
    :catch_1
    instance-of p1, p0, Ljava/io/IOException;

    .line 359
    .line 360
    if-eqz p1, :cond_a

    .line 361
    .line 362
    check-cast p0, Ljava/io/IOException;

    .line 363
    .line 364
    throw p0

    .line 365
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 366
    .line 367
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 368
    .line 369
    .line 370
    throw p1

    .line 371
    :cond_b
    invoke-static {v4}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    check-cast p0, Ljava/io/OutputStream;

    .line 376
    .line 377
    throw v7
.end method

.method public c(La/xhe0;La/eld0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nuj0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/mhu0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, La/mhu0;->a()La/mhu0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p2, v0, La/mhu0;->c:La/eld0;

    .line 21
    .line 22
    iget p0, v0, La/mhu0;->a:I

    .line 23
    .line 24
    or-int/lit8 p0, p0, 0x8

    .line 25
    .line 26
    iput p0, v0, La/mhu0;->a:I

    .line 27
    .line 28
    return-void
.end method

.method public d(ILa/n0a;Ljava/util/ArrayList;Ljava/util/ArrayList;La/hy9;Landroid/util/Range;Z)La/srm0;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v12, 0x0

    .line 1
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v1}, La/n0a;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/fot0;

    .line 8
    iget-object v11, v10, La/fot0;->j:La/h55;

    if-eqz v11, :cond_6

    .line 9
    iget-object v14, v0, La/trm0;->c:Ljava/lang/Object;

    check-cast v14, La/h3a;

    if-eqz v14, :cond_5

    .line 10
    iget-object v15, v10, La/fot0;->i:La/fpt0;

    invoke-interface {v15}, La/h0x;->k()I

    move-result v15

    .line 11
    invoke-virtual {v10}, La/fot0;->c()Landroid/util/Size;

    move-result-object v12

    if-eqz v12, :cond_4

    const/16 p4, 0x0

    .line 12
    iget-object v13, v10, La/fot0;->i:La/fpt0;

    .line 13
    invoke-interface {v13}, La/fpt0;->u()La/urm0;

    move-result-object v13

    move-object/from16 v16, v9

    .line 14
    iget-object v9, v14, La/h3a;->d:Ljava/util/Map;

    invoke-interface {v9, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    .line 15
    const-string v8, "No such camera id in supported combination list: "

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 16
    invoke-static {v8, v9}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 17
    iget-object v8, v14, La/h3a;->c:Ljava/lang/Object;

    monitor-enter v8

    :try_start_0
    iget-object v9, v14, La/h3a;->d:Ljava/util/Map;

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/hln0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v8

    if-eqz v9, :cond_3

    move/from16 v8, p1

    .line 18
    invoke-virtual {v9, v8, v15, v12, v13}, La/hln0;->q(IILandroid/util/Size;La/urm0;)La/wln0;

    move-result-object v18

    .line 19
    iget-object v9, v10, La/fot0;->i:La/fpt0;

    invoke-interface {v9}, La/h0x;->k()I

    move-result v19

    .line 20
    invoke-virtual {v10}, La/fot0;->c()Landroid/util/Size;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v9, v11, La/h55;->c:La/agn;

    .line 22
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 23
    instance-of v13, v10, La/qrm0;

    if-eqz v13, :cond_0

    .line 24
    move-object v13, v10

    check-cast v13, La/qrm0;

    .line 25
    iget-object v13, v13, La/qrm0;->s:La/fnu0;

    .line 26
    iget-object v13, v13, La/fnu0;->a:Ljava/util/HashSet;

    .line 27
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La/fot0;

    .line 28
    iget-object v14, v14, La/fot0;->i:La/fpt0;

    .line 29
    invoke-interface {v14}, La/fpt0;->v()La/hpt0;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 30
    :cond_0
    iget-object v13, v10, La/fot0;->i:La/fpt0;

    .line 31
    invoke-interface {v13}, La/fpt0;->v()La/hpt0;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    :cond_1
    iget-object v13, v11, La/h55;->f:La/drd;

    .line 33
    iget-object v14, v10, La/fot0;->i:La/fpt0;

    .line 34
    sget-object v15, La/fpt0;->H0:La/u15;

    invoke-interface {v14, v15, v3}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v24

    .line 35
    iget-object v14, v10, La/fot0;->i:La/fpt0;

    .line 36
    sget-object v15, La/h55;->h:Landroid/util/Range;

    .line 37
    sget-object v8, La/fpt0;->I0:La/u15;

    invoke-interface {v14, v8, v15}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v25, v8

    check-cast v25, Landroid/util/Range;

    if-eqz v25, :cond_2

    .line 38
    iget-object v8, v10, La/fot0;->i:La/fpt0;

    .line 39
    sget-object v14, La/fpt0;->J0:La/u15;

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v8, v14, v15}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v26

    .line 40
    iget-object v8, v10, La/fot0;->i:La/fpt0;

    .line 41
    invoke-virtual {v10}, La/fot0;->c()Landroid/util/Size;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v8, v14}, La/fpt0;->w(Landroid/util/Size;)I

    move-result v27

    .line 42
    new-instance v17, La/l15;

    move-object/from16 v21, v9

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    invoke-direct/range {v17 .. v27}, La/l15;-><init>(La/wln0;ILandroid/util/Size;La/agn;Ljava/util/List;La/drd;ILandroid/util/Range;ZI)V

    move-object/from16 v8, v17

    .line 43
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-interface {v7, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    invoke-interface {v6, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v9, v16

    const/4 v12, 0x0

    goto/16 :goto_0

    .line 46
    :cond_2
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    .line 47
    :cond_3
    const-string v0, "No such camera id in supported combination list: "

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    :catchall_0
    move-exception v0

    .line 49
    monitor-exit v8

    throw v0

    :cond_4
    const/16 p4, 0x0

    .line 50
    const-string v0, "Attached surface resolution cannot be null for already attached use cases."

    .line 51
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    :cond_5
    const/16 p4, 0x0

    .line 52
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object p4

    :cond_6
    const/16 p4, 0x0

    .line 53
    const-string v0, "Attached stream spec cannot be null for already attached use cases."

    .line 54
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    :cond_7
    const/16 p4, 0x0

    .line 55
    new-instance v12, Landroid/util/Pair;

    invoke-direct {v12, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    iget-object v4, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v13, v4

    check-cast v13, Ljava/util/Map;

    .line 57
    sget-object v4, La/hy9;->H:La/u15;

    sget-object v5, La/ipt0;->a:La/gpt0;

    move-object/from16 v6, p5

    invoke-interface {v6, v4, v5}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/ipt0;

    .line 58
    iget-object v5, v0, La/trm0;->b:Ljava/lang/Object;

    check-cast v5, La/u3a;

    move-object/from16 v6, p6

    .line 59
    invoke-static {v2, v4, v5, v6}, La/t3a;->w(Ljava/util/ArrayList;La/ipt0;La/ipt0;Landroid/util/Range;)Ljava/util/HashMap;

    move-result-object v4

    .line 60
    invoke-interface {v1}, La/n0a;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_47

    .line 63
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 65
    :try_start_1
    invoke-interface {v1}, La/n0a;->g()Landroid/graphics/Rect;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object/from16 v7, p4

    .line 66
    :goto_2
    new-instance v8, La/gxu;

    if-eqz v7, :cond_8

    .line 67
    invoke-static {v7}, La/jls0;->f(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v7

    goto :goto_3

    :cond_8
    move-object/from16 v7, p4

    .line 68
    :goto_3
    invoke-direct {v8, v1, v7}, La/gxu;-><init>(La/n0a;Landroid/util/Size;)V

    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/fot0;

    .line 70
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_9

    check-cast v10, La/p3a;

    .line 71
    iget-object v11, v10, La/p3a;->a:La/fpt0;

    .line 72
    iget-object v10, v10, La/p3a;->b:La/fpt0;

    .line 73
    invoke-virtual {v9, v1, v11, v10}, La/fot0;->q(La/n0a;La/fpt0;La/fpt0;)La/fpt0;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    invoke-interface {v15, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    invoke-virtual {v8, v10}, La/gxu;->j(La/fpt0;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v6, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 76
    :cond_9
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    .line 77
    :cond_a
    new-instance v7, La/u5l0;

    const/16 v8, 0x15

    invoke-direct {v7, v4, v1, v8}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v2, v7}, La/qsm0;->u(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)La/rfu0;

    move-result-object v1

    .line 78
    iget-object v0, v0, La/trm0;->c:Ljava/lang/Object;

    check-cast v0, La/h3a;

    if-eqz v0, :cond_46

    .line 79
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v13}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 80
    invoke-static {v2}, La/qsm0;->t(Ljava/util/ArrayList;)Z

    move-result v2

    .line 81
    iget-object v7, v0, La/h3a;->d:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    .line 82
    const-string v8, "No such camera id in supported combination list: "

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 83
    invoke-static {v8, v7}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 84
    iget-object v7, v0, La/h3a;->c:Ljava/lang/Object;

    monitor-enter v7

    :try_start_2
    iget-object v0, v0, La/h3a;->d:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, La/hln0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v7

    if-eqz v8, :cond_45

    .line 85
    iget-object v0, v8, La/hln0;->y:La/xvk;

    .line 86
    iget-object v5, v0, La/xvk;->c:Ljava/lang/Object;

    .line 87
    monitor-enter v5

    :try_start_3
    invoke-virtual {v0}, La/xvk;->a()Landroid/util/Size;

    move-result-object v7

    iput-object v7, v0, La/xvk;->f:Landroid/util/Size;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 88
    iget-object v0, v8, La/hln0;->v:La/m55;

    if-nez v0, :cond_b

    .line 89
    invoke-virtual {v8}, La/hln0;->c()V

    goto :goto_5

    .line 90
    :cond_b
    iget-object v0, v8, La/hln0;->y:La/xvk;

    invoke-virtual {v0}, La/xvk;->c()Landroid/util/Size;

    move-result-object v19

    .line 91
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v0

    .line 92
    iget-object v0, v0, La/m55;->a:Landroid/util/Size;

    .line 93
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v5

    .line 94
    iget-object v5, v5, La/m55;->b:Ljava/util/LinkedHashMap;

    .line 95
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v7

    .line 96
    iget-object v7, v7, La/m55;->d:Ljava/util/LinkedHashMap;

    .line 97
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v9

    .line 98
    iget-object v9, v9, La/m55;->e:Landroid/util/Size;

    .line 99
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v10

    .line 100
    iget-object v10, v10, La/m55;->f:Ljava/util/LinkedHashMap;

    .line 101
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v11

    .line 102
    iget-object v11, v11, La/m55;->g:Ljava/util/LinkedHashMap;

    move-object/from16 v17, v0

    .line 103
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v0

    .line 104
    iget-object v0, v0, La/m55;->h:Ljava/util/LinkedHashMap;

    move-object/from16 v24, v0

    .line 105
    invoke-virtual {v8}, La/hln0;->m()La/m55;

    move-result-object v0

    .line 106
    iget-object v0, v0, La/m55;->i:Ljava/util/LinkedHashMap;

    .line 107
    new-instance v16, La/m55;

    move-object/from16 v25, v0

    move-object/from16 v18, v5

    move-object/from16 v20, v7

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    invoke-direct/range {v16 .. v25}, La/m55;-><init>(Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    move-object/from16 v0, v16

    .line 108
    iput-object v0, v8, La/hln0;->v:La/m55;

    .line 109
    :goto_5
    sget-object v0, La/pxv;->f:Landroid/util/Range;

    .line 110
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 114
    check-cast v10, La/l15;

    .line 115
    iget v10, v10, La/l15;->g:I

    .line 116
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 117
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 118
    :cond_c
    check-cast v0, Ljava/lang/Iterable;

    .line 119
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 121
    check-cast v10, La/fpt0;

    .line 122
    sget-object v11, La/fpt0;->H0:La/u15;

    invoke-interface {v10, v11, v3}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 124
    :cond_d
    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    const/4 v9, 0x1

    if-eqz v5, :cond_f

    :cond_e
    const/4 v5, 0x0

    goto :goto_8

    .line 126
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-ne v10, v9, :cond_10

    move v5, v9

    :goto_8
    if-eqz v5, :cond_13

    .line 127
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_a

    .line 128
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-ne v10, v9, :cond_12

    goto :goto_9

    .line 129
    :cond_12
    const-string v0, "All sessionTypes should be high-speed when any of them is high-speed"

    .line 130
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    :cond_13
    :goto_a
    if-eqz v5, :cond_19

    .line 131
    iget-object v0, v8, La/hln0;->C:La/pxv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, La/pxv;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 133
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 134
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_15

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v7, v9

    check-cast v7, Landroid/util/Size;

    move/from16 p3, v2

    .line 135
    iget-object v2, v0, La/pxv;->e:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 136
    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 137
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    move/from16 v2, p3

    const/16 v7, 0xa

    const/4 v9, 0x1

    goto :goto_b

    :cond_15
    move/from16 p3, v2

    .line 138
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, La/wp20;->a(I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 139
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 140
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 141
    check-cast v6, Ljava/util/Map$Entry;

    .line 142
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 143
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 144
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 p5, v2

    move-object v2, v10

    check-cast v2, Landroid/util/Size;

    .line 146
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 147
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    move-object/from16 v2, p5

    goto :goto_d

    :cond_17
    move-object/from16 p5, v2

    .line 148
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_18
    move-object/from16 v19, v0

    goto :goto_e

    :cond_19
    move/from16 p3, v2

    move-object/from16 v19, v6

    .line 149
    :goto_e
    invoke-interface/range {v19 .. v19}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 150
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1a
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/fpt0;

    .line 153
    sget-object v10, La/fpt0;->G0:La/u15;

    invoke-interface {v9, v10, v3}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1a

    .line 155
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 156
    :cond_1b
    invoke-static {v0}, La/v3d;->s(Ljava/util/List;)V

    .line 157
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 159
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1d
    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/fpt0;

    .line 160
    sget-object v11, La/fpt0;->G0:La/u15;

    invoke-interface {v10, v11, v3}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ne v7, v11, :cond_1d

    .line 161
    invoke-interface {v2, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 162
    :cond_1e
    iget-object v0, v8, La/hln0;->B:La/cgx0;

    invoke-virtual {v0, v4, v2, v6}, La/cgx0;->t(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object v3

    .line 163
    const-string v0, "CXCP"

    invoke-static {v0}, La/l8x;->f0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 164
    const-string v0, "CXCP"

    .line 165
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "resolvedDynamicRanges = "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 166
    invoke-static {v0, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    :cond_1f
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/16 v9, 0x1005

    if-eqz v7, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/l15;

    .line 168
    iget v7, v7, La/l15;->b:I

    if-ne v7, v9, :cond_20

    :goto_11
    move-object/from16 v21, v6

    const/4 v6, 0x1

    goto :goto_12

    .line 169
    :cond_21
    invoke-interface/range {v19 .. v19}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/fpt0;

    .line 170
    invoke-interface {v7}, La/h0x;->k()I

    move-result v7

    if-ne v7, v9, :cond_22

    goto :goto_11

    :cond_23
    move-object/from16 v21, v6

    const/4 v6, 0x0

    .line 171
    :goto_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v7, p4

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/l15;

    .line 172
    iget-boolean v9, v9, La/l15;->i:Z

    if-eqz v7, :cond_25

    .line 173
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 174
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_24

    goto :goto_14

    .line 175
    :cond_24
    const-string v0, "All isStrictFpsRequired should be the same"

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object p4

    .line 176
    :cond_25
    :goto_14
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_13

    .line 177
    :cond_26
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/fpt0;

    .line 178
    sget-object v10, La/fpt0;->J0:La/u15;

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v9, v10, v11}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v7, :cond_28

    .line 179
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_27

    goto :goto_16

    .line 180
    :cond_27
    const-string v0, "All isStrictFpsRequired should be the same"

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object p4

    :cond_28
    :goto_16
    move-object v7, v9

    goto :goto_15

    :cond_29
    if-eqz v7, :cond_2a

    .line 181
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_17

    :cond_2a
    const/4 v0, 0x0

    .line 182
    :goto_17
    sget-object v7, La/h55;->h:Landroid/util/Range;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_18
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/l15;

    .line 184
    iget-object v10, v10, La/l15;->h:Landroid/util/Range;

    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    invoke-static {v10, v7, v0}, La/hln0;->o(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;

    move-result-object v7

    goto :goto_18

    .line 187
    :cond_2b
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v10, v7

    :goto_19
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 188
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/fpt0;

    sget-object v11, La/h55;->h:Landroid/util/Range;

    move-object/from16 v20, v2

    .line 189
    sget-object v2, La/fpt0;->I0:La/u15;

    invoke-interface {v7, v2, v11}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Range;

    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    invoke-static {v2, v10, v0}, La/hln0;->o(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;

    move-result-object v10

    move-object/from16 v2, v20

    goto :goto_19

    :cond_2c
    move-object/from16 v20, v2

    .line 192
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 193
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    .line 194
    sget-object v0, La/rfu0;->e:La/rfu0;

    if-ne v1, v0, :cond_2d

    const/4 v0, 0x1

    goto :goto_1a

    :cond_2d
    const/4 v0, 0x0

    .line 195
    :goto_1a
    const-string v2, "CXCP"

    invoke-static {v2}, La/l8x;->f0(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 196
    const-string v2, "CXCP"

    .line 197
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "getSuggestedStreamSpecifications: isPreviewStabilizationSupported = "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    iget-boolean v9, v8, La/hln0;->t:Z

    .line 199
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 200
    const-string v9, ", isFeatureComboInvocation = "

    .line 201
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, p7

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 202
    invoke-static {v2, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1b

    :cond_2e
    move/from16 v9, p7

    :goto_1b
    if-eqz v0, :cond_30

    .line 203
    iget-boolean v0, v8, La/hln0;->t:Z

    if-nez v0, :cond_30

    if-nez v9, :cond_2f

    goto :goto_1c

    .line 204
    :cond_2f
    const-string v0, "Preview stabilization is not supported by the camera."

    .line 205
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    return-object p4

    .line 206
    :cond_30
    :goto_1c
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_32

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/agn;

    .line 208
    iget v2, v2, La/agn;->b:I

    const/16 v7, 0xa

    if-ne v2, v7, :cond_31

    :goto_1d
    move v0, v5

    move-object v5, v1

    goto :goto_1e

    :cond_32
    const/16 v7, 0x8

    goto :goto_1d

    .line 209
    :goto_1e
    new-instance v1, La/gln0;

    const/4 v9, 0x0

    move/from16 v2, p1

    move-object/from16 v22, v3

    move-object/from16 v18, v4

    move v3, v7

    move-object/from16 v23, v12

    move-object/from16 p5, v15

    const/4 v12, 0x1

    move/from16 v4, p3

    move v7, v0

    move-object v15, v8

    move/from16 v8, p7

    invoke-direct/range {v1 .. v11}, La/gln0;-><init>(IIZLa/rfu0;ZZZZLandroid/util/Range;Z)V

    .line 210
    invoke-virtual {v15, v1}, La/hln0;->t(La/gln0;)V

    .line 211
    invoke-virtual/range {v22 .. v22}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    if-nez p7, :cond_33

    .line 212
    sget-object v0, La/fln0;->a:La/fln0;

    goto :goto_20

    .line 213
    :cond_33
    sget-object v2, La/agn;->e:La/agn;

    invoke-interface {v0, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 214
    invoke-virtual {v10}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_34

    goto :goto_1f

    :cond_34
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_35

    add-int/lit8 v0, v0, 0x1

    .line 215
    :cond_35
    :goto_1f
    sget-object v2, La/rfu0;->d:La/rfu0;

    if-eq v5, v2, :cond_36

    .line 216
    sget-object v2, La/rfu0;->e:La/rfu0;

    if-ne v5, v2, :cond_37

    :cond_36
    add-int/lit8 v0, v0, 0x1

    :cond_37
    if-eqz v6, :cond_38

    add-int/lit8 v0, v0, 0x1

    :cond_38
    if-le v0, v12, :cond_39

    .line 217
    sget-object v0, La/fln0;->b:La/fln0;

    goto :goto_20

    :cond_39
    if-ne v0, v12, :cond_3a

    .line 218
    sget-object v0, La/fln0;->c:La/fln0;

    goto :goto_20

    .line 219
    :cond_3a
    sget-object v0, La/fln0;->a:La/fln0;

    .line 220
    :goto_20
    const-string v2, "CXCP"

    invoke-static {v2}, La/l8x;->f0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3b

    .line 221
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "resolveSpecsByCheckingMethod: checkingMethod = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 222
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    :cond_3b
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v3, 0x37f

    if-eqz v0, :cond_40

    if-eq v0, v12, :cond_3e

    const/4 v4, 0x2

    if-ne v0, v4, :cond_3d

    move-object/from16 v4, p4

    const/4 v0, 0x0

    .line 224
    :try_start_4
    invoke-static {v1, v0, v4, v3}, La/gln0;->a(La/gln0;ZLandroid/util/Range;I)La/gln0;

    move-result-object v0

    invoke-virtual {v15, v0}, La/hln0;->t(La/gln0;)V
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    move-object/from16 v17, v0

    move-object/from16 v16, v15

    .line 225
    :try_start_5
    invoke-virtual/range {v16 .. v22}, La/hln0;->p(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)La/tmn0;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1

    const/4 v4, 0x0

    goto :goto_22

    :catch_1
    move-exception v0

    move-object/from16 v15, v16

    goto :goto_21

    :catch_2
    move-exception v0

    .line 226
    :goto_21
    invoke-static {v2}, La/l8x;->f0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3c

    .line 227
    const-string v4, "Failed to find a supported combination without feature combo, trying again with feature combo"

    .line 228
    invoke-static {v2, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3c
    const/4 v4, 0x0

    .line 229
    invoke-static {v1, v12, v4, v3}, La/gln0;->a(La/gln0;ZLandroid/util/Range;I)La/gln0;

    move-result-object v0

    invoke-virtual {v15, v0}, La/hln0;->t(La/gln0;)V

    move-object/from16 v17, v0

    move-object/from16 v16, v15

    .line 230
    invoke-virtual/range {v16 .. v22}, La/hln0;->p(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)La/tmn0;

    move-result-object v0

    goto :goto_22

    :cond_3d
    move-object/from16 v4, p4

    .line 231
    invoke-static {}, La/t9f;->b()V

    return-object v4

    :cond_3e
    if-eqz p7, :cond_3f

    .line 232
    sget-object v0, La/h55;->h:Landroid/util/Range;

    :cond_3f
    const/16 v0, 0x27f

    .line 233
    invoke-static {v1, v12, v10, v0}, La/gln0;->a(La/gln0;ZLandroid/util/Range;I)La/gln0;

    move-result-object v0

    .line 234
    invoke-virtual {v15, v0}, La/hln0;->t(La/gln0;)V

    move-object/from16 v17, v0

    move-object/from16 v16, v15

    .line 235
    invoke-virtual/range {v16 .. v22}, La/hln0;->p(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)La/tmn0;

    move-result-object v0

    goto :goto_22

    :cond_40
    move-object/from16 v4, p4

    const/4 v0, 0x0

    .line 236
    invoke-static {v1, v0, v4, v3}, La/gln0;->a(La/gln0;ZLandroid/util/Range;I)La/gln0;

    move-result-object v0

    invoke-virtual {v15, v0}, La/hln0;->t(La/gln0;)V

    move-object/from16 v17, v0

    move-object/from16 v16, v15

    .line 237
    invoke-virtual/range {v16 .. v22}, La/hln0;->p(La/gln0;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)La/tmn0;

    move-result-object v0

    .line 238
    :goto_22
    iget-object v1, v0, La/tmn0;->a:Ljava/util/LinkedHashMap;

    .line 239
    iget-object v2, v0, La/tmn0;->b:Ljava/util/LinkedHashMap;

    .line 240
    iget v0, v0, La/tmn0;->c:I

    .line 241
    invoke-virtual/range {p5 .. p5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_42

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 242
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 243
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_41

    .line 244
    invoke-interface {v14, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_23

    .line 245
    :cond_41
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 v4, 0x0

    return-object v4

    .line 246
    :cond_42
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_43
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_48

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 247
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_43

    .line 248
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_44

    .line 249
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 250
    invoke-interface {v14, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    .line 251
    :cond_44
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 v4, 0x0

    return-object v4

    :catchall_1
    move-exception v0

    .line 252
    monitor-exit v5

    throw v0

    .line 253
    :cond_45
    const-string v0, "No such camera id in supported combination list: "

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 254
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 v4, 0x0

    return-object v4

    :catchall_2
    move-exception v0

    .line 255
    monitor-exit v7

    throw v0

    :cond_46
    move-object/from16 v4, p4

    .line 256
    const-string v0, "Required value was null."

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v4

    :cond_47
    move-object/from16 v23, v12

    const v0, 0x7fffffff

    .line 257
    :cond_48
    new-instance v1, La/srm0;

    move-object/from16 v2, v23

    .line 258
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Ljava/util/Map;

    invoke-static {v2, v14}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 259
    invoke-direct {v1, v0, v2}, La/srm0;-><init>(ILjava/util/Map;)V

    return-object v1
.end method

.method public e()F
    .locals 2

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/pz40;

    .line 4
    .line 5
    check-cast v0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/pz40;

    .line 20
    .line 21
    check-cast p0, La/hgk0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sub-int/2addr v0, p0

    .line 34
    int-to-float p0, v0

    .line 35
    const/high16 v0, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr p0, v0

    .line 38
    const/4 v0, 0x0

    .line 39
    cmpg-float v1, p0, v0

    .line 40
    .line 41
    if-gez v1, :cond_0

    .line 42
    .line 43
    return v0

    .line 44
    :cond_0
    return p0
.end method

.method public f(ILa/zje;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/mgt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/mgt0;

    .line 7
    .line 8
    iget v1, v0, La/mgt0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/mgt0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/mgt0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/mgt0;-><init>(La/trm0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, La/mgt0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/mgt0;->k:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/rbt0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v1, p0

    .line 61
    check-cast v1, La/rgt0;

    .line 62
    .line 63
    iput v2, v7, La/mgt0;->k:I

    .line 64
    .line 65
    const-string v2, "application/vnd.xenvelop+json"

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    move v5, p1

    .line 69
    move-object v3, p3

    .line 70
    move-object v4, p4

    .line 71
    invoke-interface/range {v1 .. v7}, La/rgt0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILa/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-ne p2, v0, :cond_3

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_3
    :goto_2
    check-cast p2, La/dx5;

    .line 79
    .line 80
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method

.method public g(La/jlw0;)La/h0q0;
    .locals 1

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/h0q0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/h0q0;->J()La/h0q0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1}, La/h0q0;->N(Ljava/lang/String;La/jlw0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public h(La/xfw0;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v7, v0

    .line 4
    check-cast v7, La/hcp0;

    .line 5
    .line 6
    check-cast p1, La/mjw0;

    .line 7
    .line 8
    iget-object v0, p1, La/mjw0;->e:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance p0, La/cmt0;

    .line 17
    .line 18
    iget-object v0, p1, La/mjw0;->e:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p1, p1, La/mjw0;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, v0, p1, v1}, La/cmt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7, p0}, La/hcp0;->c(La/cmt0;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 31
    .line 32
    iget-object v0, p1, La/mjw0;->b:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p1, La/mjw0;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v3, p1, La/mjw0;->c:J

    .line 37
    .line 38
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/trm0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v1, p1

    .line 48
    check-cast v1, La/nmt0;

    .line 49
    .line 50
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    move-object v8, p0

    .line 56
    invoke-virtual/range {v1 .. v8}, La/nmt0;->g(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/zzc;La/hcp0;La/ngw0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public i(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/u4v0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/u4v0;

    .line 7
    .line 8
    iget v1, v0, La/u4v0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/u4v0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u4v0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/u4v0;-><init>(La/trm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/u4v0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u4v0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/hcp0;

    .line 53
    .line 54
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput v3, v0, La/u4v0;->k:I

    .line 63
    .line 64
    iget-object p1, p1, La/hcp0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/rbt0;

    .line 67
    .line 68
    invoke-virtual {p1}, La/rbt0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, La/t4v0;

    .line 73
    .line 74
    const-string v2, "application/vnd.xenvelop+json"

    .line 75
    .line 76
    invoke-interface {p1, p0, v2, v0}, La/t4v0;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    :goto_1
    check-cast p1, La/dx5;

    .line 84
    .line 85
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public j([BLa/fck0;)[B
    .locals 6

    .line 1
    iget-object v0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/p3x0;

    .line 4
    .line 5
    iget-object v1, p2, La/fck0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/icw0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/icw0;->b()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1, p1}, La/p3x0;->b([B[B)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p2, p2, La/fck0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, La/icw0;

    .line 20
    .line 21
    invoke-virtual {p2}, La/icw0;->b()[B

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    filled-new-array {p1, p2}, [[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, La/egm0;->B([[B)[B

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object p2, La/c3x0;->b:[B

    .line 34
    .line 35
    sget-object v1, La/c3x0;->m:[B

    .line 36
    .line 37
    filled-new-array {v1, p2}, [[B

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p2}, La/egm0;->B([[B)[B

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, La/h70;

    .line 48
    .line 49
    iget-object v1, p0, La/h70;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljavax/crypto/Mac;->getMacLength()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    sget-object v2, La/c3x0;->o:[B

    .line 60
    .line 61
    sget-object v3, La/x7x0;->a:Ljava/nio/charset/Charset;

    .line 62
    .line 63
    const-string v4, "eae_prk"

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    filled-new-array {v2, p2, v4, v0}, [[B

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, La/egm0;->B([[B)[B

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-virtual {p0, v0, v4}, La/h70;->b([B[B)[B

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v4, 0x2

    .line 83
    invoke-static {v4, v1}, La/c3x0;->b(II)[B

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "shared_secret"

    .line 88
    .line 89
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    filled-new-array {v4, v2, p2, v3, p1}, [[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, La/egm0;->B([[B)[B

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, v1, v0, p1}, La/h70;->a(I[B[B)[B

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public k(I)V
    .locals 7

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/rrd;

    .line 4
    .line 5
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gst0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/gst0;->e()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object p0, v0, La/rrd;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/tg5;

    .line 16
    .line 17
    iget-object v0, p0, La/tg5;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, La/ql5;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/16 v6, 0x1f7f

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    move v5, p1

    .line 38
    invoke-static/range {v1 .. v6}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, La/tg5;->c(La/ql5;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public l(La/bm5;La/ql5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/ot;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, La/ot;->a(La/bm5;La/ql5;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/bm5;->d:La/bm5;

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    sget-object v0, La/bm5;->e:La/bm5;

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/jyg0;

    .line 27
    .line 28
    iget-wide v0, p2, La/ql5;->a:J

    .line 29
    .line 30
    iget-object p0, p0, La/jyg0;->a:La/rrd;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0, v1}, La/rrd;->z(La/bm5;J)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public m(Lokhttp3/RequestBody$Companion$toRequestBody$3;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/y8o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/y8o0;

    .line 7
    .line 8
    iget v1, v0, La/y8o0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/y8o0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/y8o0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/y8o0;-><init>(La/trm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/y8o0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/y8o0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/jfm0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/jfm0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/x8o0;

    .line 59
    .line 60
    iput v3, v0, La/y8o0;->k:I

    .line 61
    .line 62
    new-instance p3, La/lwf;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {p3, v2}, La/lwf;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p0, p1, p2, p3, v0}, La/x8o0;->b(Lokhttp3/RequestBody;Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method

.method public n(La/xhe0;I)La/eld0;
    .locals 4

    .line 1
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nuj0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/nuj0;->d(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, La/nuj0;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/mhu0;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    iget v2, v1, La/mhu0;->a:I

    .line 22
    .line 23
    and-int v3, v2, p2

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    not-int v3, p2

    .line 28
    and-int/2addr v2, v3

    .line 29
    iput v2, v1, La/mhu0;->a:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    if-ne p2, v3, :cond_1

    .line 33
    .line 34
    iget-object p2, v1, La/mhu0;->b:La/eld0;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v3, 0x8

    .line 38
    .line 39
    if-ne p2, v3, :cond_3

    .line 40
    .line 41
    iget-object p2, v1, La/mhu0;->c:La/eld0;

    .line 42
    .line 43
    :goto_0
    and-int/lit8 v2, v2, 0xc

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/nuj0;->g(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput p0, v1, La/mhu0;->a:I

    .line 52
    .line 53
    iput-object v0, v1, La/mhu0;->b:La/eld0;

    .line 54
    .line 55
    iput-object v0, v1, La/mhu0;->c:La/eld0;

    .line 56
    .line 57
    sget-object p0, La/mhu0;->d:La/awa0;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, La/awa0;->c(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p2

    .line 63
    :cond_3
    const-string p0, "Must provide flag PRE or POST"

    .line 64
    .line 65
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_1
    return-object v0
.end method

.method public o(La/xhe0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nuj0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mhu0;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget p1, p0, La/mhu0;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    iput p1, p0, La/mhu0;->a:I

    .line 19
    .line 20
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/trm0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/trm0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/b1x0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/kxw0;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput-boolean v3, p0, La/b1x0;->j:Z

    .line 22
    .line 23
    invoke-virtual {p0}, La/b1x0;->J1()Ljava/util/PriorityQueue;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzoh;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v1, La/btw0;->v0:La/atw0;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-virtual {v1, v4}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget v4, p0, La/b1x0;->k:I

    .line 46
    .line 47
    if-le v4, v1, :cond_0

    .line 48
    .line 49
    iput v2, p0, La/b1x0;->k:I

    .line 50
    .line 51
    iget-object p0, v0, La/kxw0;->f:La/uuw0;

    .line 52
    .line 53
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 57
    .line 58
    invoke-virtual {v0}, La/kxw0;->k()La/vtw0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, La/vtw0;->r1()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v1, "registerTriggerAsync failed. May try later. App ID, throwable"

    .line 79
    .line 80
    invoke-virtual {p0, v0, p1, v1}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iget-object v1, v0, La/kxw0;->f:La/uuw0;

    .line 85
    .line 86
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v1, La/uuw0;->j:La/quw0;

    .line 90
    .line 91
    invoke-virtual {v0}, La/kxw0;->k()La/vtw0;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, La/vtw0;->r1()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v4}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iget v5, p0, La/b1x0;->k:I

    .line 104
    .line 105
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v5}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string v6, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    .line 122
    .line 123
    invoke-virtual {v1, v6, v4, v5, p1}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget p1, p0, La/b1x0;->k:I

    .line 127
    .line 128
    iget-object v1, p0, La/b1x0;->l:La/ezw0;

    .line 129
    .line 130
    if-nez v1, :cond_1

    .line 131
    .line 132
    new-instance v1, La/ezw0;

    .line 133
    .line 134
    invoke-direct {v1, p0, v0, v2, v3}, La/ezw0;-><init>(La/b1x0;La/syw0;BZ)V

    .line 135
    .line 136
    .line 137
    iput-object v1, p0, La/b1x0;->l:La/ezw0;

    .line 138
    .line 139
    :cond_1
    int-to-long v2, p1

    .line 140
    const-wide/16 v4, 0x3e8

    .line 141
    .line 142
    mul-long/2addr v2, v4

    .line 143
    invoke-virtual {v1, v2, v3}, La/bmw0;->b(J)V

    .line 144
    .line 145
    .line 146
    iget p1, p0, La/b1x0;->k:I

    .line 147
    .line 148
    add-int/2addr p1, p1

    .line 149
    iput p1, p0, La/b1x0;->k:I

    .line 150
    .line 151
    :goto_0
    return-void

    .line 152
    :sswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    const-string v0, "SurfaceReleaseFuture did not complete nicely."

    .line 155
    .line 156
    invoke-direct {p0, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :sswitch_1
    instance-of v0, p1, La/nmn0;

    .line 161
    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v4, "Camera surface session should only fail with request cancellation. Instead failed due to:\n"

    .line 165
    .line 166
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1, v0}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    check-cast v1, La/sbe;

    .line 180
    .line 181
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Landroid/view/Surface;

    .line 184
    .line 185
    new-instance p1, La/k55;

    .line 186
    .line 187
    invoke-direct {p1, v2, p0}, La/k55;-><init>(ILandroid/view/Surface;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v1, p1}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    nop

    .line 195
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-byte v0, p0, La/trm0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/trm0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/b1x0;

    .line 13
    .line 14
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/p4;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/kxw0;

    .line 20
    .line 21
    iget-object v0, p1, La/kxw0;->e:La/wvw0;

    .line 22
    .line 23
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, La/wvw0;->s1()Landroid/util/SparseArray;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzoh;

    .line 31
    .line 32
    iget v4, v3, Lcom/google/android/gms/measurement/internal/zzoh;->c:I

    .line 33
    .line 34
    iget-wide v5, v3, Lcom/google/android/gms/measurement/internal/zzoh;->b:J

    .line 35
    .line 36
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p1, La/kxw0;->e:La/wvw0;

    .line 44
    .line 45
    invoke-static {v4}, La/kxw0;->e(La/p4;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    new-array v5, v5, [I

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    new-array v6, v6, [J

    .line 59
    .line 60
    move v7, v2

    .line 61
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-ge v7, v8, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->keyAt(I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    aput v8, v5, v7

    .line 72
    .line 73
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    aput-wide v8, v6, v7

    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v7, "uriSources"

    .line 94
    .line 95
    invoke-virtual {v0, v7, v5}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 96
    .line 97
    .line 98
    const-string v5, "uriTimestamps"

    .line 99
    .line 100
    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 101
    .line 102
    .line 103
    iget-object v4, v4, La/wvw0;->o:La/fht0;

    .line 104
    .line 105
    invoke-virtual {v4, v0}, La/fht0;->y(Landroid/os/Bundle;)V

    .line 106
    .line 107
    .line 108
    iput-boolean v2, p0, La/b1x0;->j:Z

    .line 109
    .line 110
    iput v1, p0, La/b1x0;->k:I

    .line 111
    .line 112
    iget-object p1, p1, La/kxw0;->f:La/uuw0;

    .line 113
    .line 114
    invoke-static {p1}, La/kxw0;->g(La/ryw0;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p1, La/uuw0;->n:La/quw0;

    .line 118
    .line 119
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzoh;->a:Ljava/lang/String;

    .line 120
    .line 121
    const-string v1, "Successfully registered trigger URI"

    .line 122
    .line 123
    invoke-virtual {p1, v0, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/b1x0;->K1()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :sswitch_0
    check-cast p1, La/k55;

    .line 131
    .line 132
    iget-byte p1, p1, La/k55;->a:B

    .line 133
    .line 134
    const/4 v0, 0x3

    .line 135
    if-eq p1, v0, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    move v1, v2

    .line 139
    :goto_1
    const-string p1, "Unexpected result from SurfaceRequest. Surface was provided twice."

    .line 140
    .line 141
    invoke-static {p1, v1}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string p1, "TextureViewImpl"

    .line 145
    .line 146
    const-string v0, "SurfaceTexture about to manually be destroyed"

    .line 147
    .line 148
    invoke-static {p1, v0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    check-cast v3, Landroid/graphics/SurfaceTexture;

    .line 152
    .line 153
    invoke-virtual {v3}, Landroid/graphics/SurfaceTexture;->release()V

    .line 154
    .line 155
    .line 156
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p0, La/a2a;

    .line 159
    .line 160
    iget-object p0, p0, La/a2a;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, La/raq0;

    .line 163
    .line 164
    iget-object p1, p0, La/raq0;->j:Landroid/graphics/SurfaceTexture;

    .line 165
    .line 166
    if-eqz p1, :cond_2

    .line 167
    .line 168
    const/4 p1, 0x0

    .line 169
    iput-object p1, p0, La/raq0;->j:Landroid/graphics/SurfaceTexture;

    .line 170
    .line 171
    :cond_2
    return-void

    .line 172
    :sswitch_1
    check-cast p1, Ljava/lang/Void;

    .line 173
    .line 174
    check-cast v3, La/sbe;

    .line 175
    .line 176
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Landroid/view/Surface;

    .line 179
    .line 180
    new-instance p1, La/k55;

    .line 181
    .line 182
    invoke-direct {p1, v2, p0}, La/k55;-><init>(ILandroid/view/Surface;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v3, p1}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method public p(La/xhe0;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/u710;

    .line 4
    .line 5
    invoke-virtual {v0}, La/u710;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/u710;->i(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne p1, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, La/u710;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v4, v3, v1

    .line 22
    .line 23
    sget-object v5, La/epv0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    aput-object v5, v3, v1

    .line 28
    .line 29
    iput-boolean v2, v0, La/u710;->a:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/nuj0;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/mhu0;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput p1, p0, La/mhu0;->a:I

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, La/mhu0;->b:La/eld0;

    .line 52
    .line 53
    iput-object p1, p0, La/mhu0;->c:La/eld0;

    .line 54
    .line 55
    sget-object p1, La/mhu0;->d:La/awa0;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, La/awa0;->c(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public r(Ljava/lang/String;IZ)La/b5x0;
    .locals 2

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/b5x0;

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/owp0;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p3}, La/owp0;->k(Ljava/lang/String;Z)La/n4x0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {v0, p2, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/b5x0;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_2
    return-object v1
.end method

.method public s(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/dgw0;

    .line 4
    .line 5
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    const-string v1, "completion source cannot be null"

    .line 10
    .line 11
    invoke-static {p0, v1}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_e

    .line 15
    .line 16
    iget-object p1, v0, La/dgw0;->k:La/cmt0;

    .line 17
    .line 18
    if-eqz p1, :cond_9

    .line 19
    .line 20
    iget-object p1, v0, La/dgw0;->c:La/nfq;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(La/nfq;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p2, v0, La/dgw0;->k:La/cmt0;

    .line 27
    .line 28
    const-string v1, "reauthenticateWithCredential"

    .line 29
    .line 30
    invoke-virtual {v0}, La/dgw0;->a()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, "reauthenticateWithCredentialWithData"

    .line 41
    .line 42
    invoke-virtual {v0}, La/dgw0;->a()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    iget-object v0, v0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 56
    .line 57
    :goto_1
    sget-object v1, La/jfw0;->a:Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v1, La/jfw0;->a:Landroid/util/SparseArray;

    .line 66
    .line 67
    const/16 v2, 0x42b6

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Landroid/util/Pair;

    .line 74
    .line 75
    new-instance v2, La/qfq;

    .line 76
    .line 77
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p2, La/cmt0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v4}, La/rsm0;->z(Ljava/util/List;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    new-instance v7, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_3

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Lcom/google/firebase/auth/MultiFactorInfo;

    .line 113
    .line 114
    instance-of v8, v6, Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 115
    .line 116
    if-eqz v8, :cond_2

    .line 117
    .line 118
    check-cast v6, Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 119
    .line 120
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    invoke-static {v4}, La/rsm0;->z(Ljava/util/List;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    new-instance v12, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_5

    .line 142
    .line 143
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    check-cast v6, Lcom/google/firebase/auth/MultiFactorInfo;

    .line 148
    .line 149
    instance-of v8, v6, Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 150
    .line 151
    if-eqz v8, :cond_4

    .line 152
    .line 153
    check-cast v6, Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 154
    .line 155
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    invoke-static {v4}, La/rsm0;->z(Ljava/util/List;)Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    iget-object v5, p2, La/cmt0;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v5}, La/s0x;->E(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v8, Lcom/google/firebase/auth/internal/zzao;

    .line 171
    .line 172
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    new-instance v6, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object v6, v8, Lcom/google/firebase/auth/internal/zzao;->c:Ljava/util/ArrayList;

    .line 181
    .line 182
    new-instance v6, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object v6, v8, Lcom/google/firebase/auth/internal/zzao;->d:Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_8

    .line 198
    .line 199
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Lcom/google/firebase/auth/MultiFactorInfo;

    .line 204
    .line 205
    instance-of v9, v6, Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 206
    .line 207
    if-eqz v9, :cond_6

    .line 208
    .line 209
    iget-object v9, v8, Lcom/google/firebase/auth/internal/zzao;->c:Ljava/util/ArrayList;

    .line 210
    .line 211
    check-cast v6, Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 212
    .line 213
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_6
    instance-of v9, v6, Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 218
    .line 219
    if-eqz v9, :cond_7

    .line 220
    .line 221
    iget-object v9, v8, Lcom/google/firebase/auth/internal/zzao;->d:Ljava/util/ArrayList;

    .line 222
    .line 223
    check-cast v6, Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 224
    .line 225
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_7
    invoke-virtual {v6}, Lcom/google/firebase/auth/MultiFactorInfo;->m()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    const-string p1, "MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: "

    .line 234
    .line 235
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_8
    iput-object v5, v8, Lcom/google/firebase/auth/internal/zzao;->b:Ljava/lang/String;

    .line 244
    .line 245
    new-instance v6, Lcom/google/firebase/auth/internal/zzaj;

    .line 246
    .line 247
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:La/nfq;

    .line 248
    .line 249
    invoke-virtual {p1}, La/nfq;->a()V

    .line 250
    .line 251
    .line 252
    iget-object v9, p1, La/nfq;->b:Ljava/lang/String;

    .line 253
    .line 254
    iget-object p1, p2, La/cmt0;->c:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v10, p1

    .line 257
    check-cast v10, Lcom/google/firebase/auth/zzc;

    .line 258
    .line 259
    move-object v11, v0

    .line 260
    check-cast v11, Lcom/google/firebase/auth/internal/zzad;

    .line 261
    .line 262
    invoke-direct/range {v6 .. v12}, Lcom/google/firebase/auth/internal/zzaj;-><init>(Ljava/util/ArrayList;Lcom/google/firebase/auth/internal/zzao;Ljava/lang/String;Lcom/google/firebase/auth/zzc;Lcom/google/firebase/auth/internal/zzad;Ljava/util/ArrayList;)V

    .line 263
    .line 264
    .line 265
    invoke-direct {v2, v3, v1}, La/rfq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_9
    iget-object p1, v0, La/dgw0;->j:Lcom/google/firebase/auth/AuthCredential;

    .line 273
    .line 274
    if-eqz p1, :cond_d

    .line 275
    .line 276
    sget-object p1, La/jfw0;->a:Landroid/util/SparseArray;

    .line 277
    .line 278
    iget p1, p2, Lcom/google/android/gms/common/api/Status;->a:I

    .line 279
    .line 280
    const/16 v0, 0x4274

    .line 281
    .line 282
    if-eq p1, v0, :cond_b

    .line 283
    .line 284
    const/16 v0, 0x426f

    .line 285
    .line 286
    if-eq p1, v0, :cond_b

    .line 287
    .line 288
    const/16 v0, 0x4281

    .line 289
    .line 290
    if-ne p1, v0, :cond_a

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_a
    invoke-static {p2}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    goto :goto_7

    .line 298
    :cond_b
    :goto_5
    sget-object v0, La/jfw0;->a:Landroid/util/SparseArray;

    .line 299
    .line 300
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, Landroid/util/Pair;

    .line 305
    .line 306
    if-eqz v0, :cond_c

    .line 307
    .line 308
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Ljava/lang/String;

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_c
    const-string v0, "An internal error has occurred."

    .line 314
    .line 315
    :goto_6
    invoke-static {v0, p2}, La/jfw0;->c(Ljava/lang/String;Lcom/google/android/gms/common/api/Status;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    new-instance v0, La/qfq;

    .line 320
    .line 321
    invoke-static {p1}, La/jfw0;->b(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-direct {v0, p1, p2}, La/rfq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    move-object p1, v0

    .line 329
    :goto_7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_d
    invoke-static {p2}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_e
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    return-void
.end method

.method public u(Ljava/lang/String;IJ)La/b5x0;
    .locals 3

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/b5x0;

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/owp0;

    .line 16
    .line 17
    iget-object p0, p0, La/owp0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/fbv;

    .line 20
    .line 21
    new-instance v2, La/v4x0;

    .line 22
    .line 23
    invoke-direct {v2, p1, p0, p3, p4}, La/v4x0;-><init>(Ljava/lang/String;La/fbv;J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    invoke-virtual {v0, p2, p0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/b5x0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    return-object v1
.end method

.method public v(ILjava/lang/String;Ljava/lang/String;)La/b5x0;
    .locals 3

    .line 1
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/b5x0;

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/owp0;

    .line 16
    .line 17
    iget-object p0, p0, La/owp0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/fbv;

    .line 20
    .line 21
    new-instance v2, La/y4x0;

    .line 22
    .line 23
    invoke-direct {v2, p2, p0, p3}, La/y4x0;-><init>(Ljava/lang/String;La/fbv;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    invoke-virtual {v0, p1, p0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/b5x0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    return-object v1
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 83
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    .line 84
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    check-cast p0, La/hcp0;

    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public zza()[B
    .locals 2

    .line 1
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/h70;

    .line 4
    .line 5
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    sparse-switch v0, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :sswitch_0
    const-string v0, "HmacSha512"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    goto :goto_0

    .line 27
    :sswitch_1
    const-string v0, "HmacSha384"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :sswitch_2
    const-string v0, "HmacSha256"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v1, 0x0

    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    packed-switch v1, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    const-string v0, "Could not determine HPKE KDF ID"

    .line 53
    .line 54
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    sget-object v0, La/c3x0;->h:[B

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_1
    sget-object v0, La/c3x0;->g:[B

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_2
    sget-object v0, La/c3x0;->f:[B

    .line 65
    .line 66
    :goto_1
    sget-object v1, La/c3x0;->f:[B

    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    sget-object p0, La/c3x0;->b:[B

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_3
    const-string v0, "Could not determine HPKE KEM ID"

    .line 78
    .line 79
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :sswitch_data_0
    .sparse-switch
        0x3aaea10e -> :sswitch_2
        0x3aaea52a -> :sswitch_1
        0x3aaeabd1 -> :sswitch_0
    .end sparse-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
