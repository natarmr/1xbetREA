.class public final La/cu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nae0;


# static fields
.field public static final e:La/baf;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/baf;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cu;->e:La/baf;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/cu;->a:B

    packed-switch p1, :pswitch_data_0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 128
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void

    .line 129
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    new-instance p1, La/hz40;

    invoke-direct {p1}, La/hz40;-><init>()V

    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 164
    iput-byte p1, p0, La/cu;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/ap80;La/knf0;La/vqc;)V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 145
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 146
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/b0c0;)V
    .locals 1

    const/16 p1, 0xb

    iput-byte p1, p0, La/cu;->a:B

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 154
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 155
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/btt0;La/xex;La/knf0;)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 137
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 138
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ii;La/i1w0;La/mne;)V
    .locals 0

    const/16 p1, 0xe

    iput-byte p1, p0, La/cu;->a:B

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object p3, p0, La/cu;->b:Ljava/lang/Object;

    .line 158
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 159
    new-instance p1, La/n8i;

    const/16 p2, 0x10

    invoke-direct {p1, p0, p2}, La/n8i;-><init>(Ljava/lang/Object;B)V

    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    move-result-object p1

    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/knf0;La/bbw0;La/jmb;)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 141
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 142
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/knf0;La/gii0;La/btt0;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, La/cu;->a:B

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p3, p0, La/cu;->b:Ljava/lang/Object;

    .line 162
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 163
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m1e;La/nvu;La/y3v;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p2, p0, La/cu;->b:Ljava/lang/Object;

    .line 124
    iput-object p3, p0, La/cu;->c:Ljava/lang/Object;

    .line 125
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/mne;La/mii0;La/gst0;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 133
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 134
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ywu;La/rrc;La/gst0;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 120
    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 121
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput-byte v0, p0, La/cu;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-class v1, Lcom/google/android/material/datepicker/e;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0405b3

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v1}, La/n6x;->U(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 22
    .line 23
    sget-object v2, La/rpd0;->A:[I

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x4

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v2, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {v2, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x5

    .line 58
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x7

    .line 66
    invoke-static {v2, p1, v1}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/16 v4, 0x9

    .line 71
    .line 72
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput-object v4, p0, La/cu;->c:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v0, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 87
    .line 88
    .line 89
    const/16 v0, 0xa

    .line 90
    .line 91
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0, p1}, La/wsf0;->d(ILandroid/content/Context;)La/wsf0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 100
    .line 101
    new-instance p0, Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 117
    iput-byte p4, p0, La/cu;->a:B

    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    iput-object p2, p0, La/cu;->c:Ljava/lang/Object;

    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, La/cu;->a:B

    const/4 v0, 0x0

    .line 165
    new-array v0, v0, [J

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 168
    iput-object v0, p0, La/cu;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/security/Signature;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/cu;->a:B

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 171
    iput-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 172
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/cu;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    new-instance v0, La/aaf;

    invoke-direct {v0, p1}, La/aaf;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 149
    new-instance v0, La/aaf;

    invoke-direct {v0, p1}, La/aaf;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, La/cu;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 150
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 151
    new-instance p1, La/aaf;

    invoke-direct {p1, p2}, La/aaf;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljavax/crypto/Cipher;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/cu;->a:B

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, La/cu;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 175
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 176
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljavax/crypto/Mac;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/cu;->a:B

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 179
    iput-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 180
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final d()V
    .locals 8

    .line 1
    new-instance v0, La/oye;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/16 v7, 0x9

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/cu;->e:La/baf;

    .line 8
    .line 9
    const-class v3, La/baf;

    .line 10
    .line 11
    const-string v4, "isBackgroundThread"

    .line 12
    .line 13
    const-string v5, "isBackgroundThread()Z"

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/oye;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Must be called on a background thread, was called on "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x2e

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x3

    .line 58
    const-string v2, "FirebaseCrashlytics"

    .line 59
    .line 60
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method

.method public static final e()V
    .locals 8

    .line 1
    new-instance v0, La/oye;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/16 v7, 0xa

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, La/cu;->e:La/baf;

    .line 8
    .line 9
    const-class v3, La/baf;

    .line 10
    .line 11
    const-string v4, "isBlockingThread"

    .line 12
    .line 13
    const-string v5, "isBlockingThread()Z"

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/oye;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Must be called on a blocking thread, was called on "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x2e

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x3

    .line 58
    const-string v2, "FirebaseCrashlytics"

    .line 59
    .line 60
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/cu;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    :try_start_1
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    monitor-exit p0

    .line 27
    throw v0
.end method

.method public b()La/e70;
    .locals 5

    .line 1
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/i70;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, La/cu;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/iw20;

    .line 11
    .line 12
    if-eqz v2, :cond_8

    .line 13
    .line 14
    iget v3, v0, La/i70;->b:I

    .line 15
    .line 16
    iget-object v2, v2, La/iw20;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/sg9;

    .line 19
    .line 20
    iget-object v2, v2, La/sg9;->a:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-ne v3, v2, :cond_7

    .line 24
    .line 25
    iget-object v0, v0, La/i70;->c:La/h70;

    .line 26
    .line 27
    sget-object v2, La/h70;->e:La/h70;

    .line 28
    .line 29
    if-eq v0, v2, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, La/cu;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 39
    .line 40
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    :goto_0
    if-eq v0, v2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v3, p0, La/cu;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v3, :cond_6

    .line 52
    .line 53
    :goto_1
    const/4 v3, 0x0

    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    new-array p0, v3, [B

    .line 57
    .line 58
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    sget-object v2, La/h70;->d:La/h70;

    .line 63
    .line 64
    const/4 v4, 0x5

    .line 65
    if-ne v0, v2, :cond_4

    .line 66
    .line 67
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    sget-object v2, La/h70;->c:La/h70;

    .line 96
    .line 97
    if-ne v0, v2, :cond_5

    .line 98
    .line 99
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v1, 0x1

    .line 104
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 125
    .line 126
    .line 127
    :goto_2
    new-instance p0, La/e70;

    .line 128
    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_5
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, La/i70;

    .line 136
    .line 137
    iget-object p0, p0, La/i70;->c:La/h70;

    .line 138
    .line 139
    const-string v0, "Unknown AesGcmSivParameters.Variant: "

    .line 140
    .line 141
    invoke-static {p0, v0}, La/hny;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_6
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 146
    .line 147
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_7
    const-string p0, "Key size mismatch"

    .line 152
    .line 153
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_8
    const-string p0, "Cannot build without parameters and/or key material"

    .line 158
    .line 159
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v1
.end method

.method public c()La/q55;
    .locals 3

    .line 1
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " backendName"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, La/cu;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/mwb0;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " priority"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    new-instance v0, La/q55;

    .line 31
    .line 32
    iget-object v1, p0, La/cu;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, La/cu;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, [B

    .line 39
    .line 40
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/mwb0;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, p0}, La/q55;-><init>(Ljava/lang/String;[BLa/mwb0;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    const-string p0, "Missing required properties:"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public f()La/nv20;
    .locals 4

    .line 1
    new-instance v0, La/nv20;

    .line 2
    .line 3
    new-instance v1, La/z220;

    .line 4
    .line 5
    iget-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/btt0;

    .line 8
    .line 9
    iget-object v3, p0, La/cu;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/gii0;

    .line 12
    .line 13
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/knf0;

    .line 16
    .line 17
    invoke-direct {v1, p0, v3, v2}, La/z220;-><init>(La/knf0;La/gii0;La/btt0;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public g()La/nr00;
    .locals 4

    .line 1
    new-instance v0, La/nr00;

    .line 2
    .line 3
    new-instance v1, La/z220;

    .line 4
    .line 5
    iget-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/btt0;

    .line 8
    .line 9
    iget-object v3, p0, La/cu;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/gii0;

    .line 12
    .line 13
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/knf0;

    .line 16
    .line 17
    invoke-direct {v1, p0, v3, v2}, La/z220;-><init>(La/knf0;La/gii0;La/btt0;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public h(Landroidx/fragment/app/Fragment;La/iiy;)[J
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, La/cu;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, [J

    .line 10
    .line 11
    if-nez p2, :cond_4

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p1, p2

    .line 32
    goto :goto_1

    .line 33
    :goto_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 34
    .line 35
    new-instance v0, La/g0g0;

    .line 36
    .line 37
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v0

    .line 41
    :goto_1
    nop

    .line 42
    instance-of v0, p1, La/g0g0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    move-object p1, p2

    .line 47
    :cond_1
    instance-of v0, p1, [J

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    check-cast p1, [J

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move-object p1, p2

    .line 55
    :goto_2
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iput-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 58
    .line 59
    move-object p2, p1

    .line 60
    :cond_3
    if-nez p2, :cond_4

    .line 61
    .line 62
    iget-object p0, p0, La/cu;->c:Ljava/lang/Object;

    .line 63
    .line 64
    move-object p2, p0

    .line 65
    check-cast p2, [J

    .line 66
    .line 67
    :cond_4
    return-object p2
.end method

.method public i(JLjava/util/List;La/iun;I)La/a1g;
    .locals 10

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/cu;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/pru;

    .line 10
    .line 11
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/cu;->b:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/hsj;

    .line 19
    .line 20
    iget-object p0, p0, La/cu;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/ntu;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    iget-object p0, v0, La/sff0;->b:La/hl1;

    .line 29
    .line 30
    iget-boolean v9, p0, La/hl1;->N:Z

    .line 31
    .line 32
    move-wide v3, p1

    .line 33
    move-object v5, p3

    .line 34
    move-object v6, p4

    .line 35
    move v8, p5

    .line 36
    invoke-virtual/range {v2 .. v9}, La/hsj;->k(JLjava/util/List;Ljava/util/List;Ljava/lang/String;IZ)La/vsg0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-static {p0, p1}, La/uvw;->Q(La/gmq;Z)La/a1g;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public j(ILa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/frt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/frt;

    .line 7
    .line 8
    iget v1, v0, La/frt;->p:I

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
    iput v1, v0, La/frt;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/frt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/frt;-><init>(La/cu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/frt;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/frt;->p:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    iget p0, v0, La/frt;->k:I

    .line 51
    .line 52
    iget p1, v0, La/frt;->j:I

    .line 53
    .line 54
    iget-boolean v2, v0, La/frt;->l:Z

    .line 55
    .line 56
    iget v6, v0, La/frt;->i:I

    .line 57
    .line 58
    iget-object v7, v0, La/frt;->m:La/ocl;

    .line 59
    .line 60
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, La/cu;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, La/iqt;

    .line 70
    .line 71
    iget-object p2, p2, La/iqt;->a:La/gst0;

    .line 72
    .line 73
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iget-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v7, v2

    .line 80
    check-cast v7, La/ocl;

    .line 81
    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    iget-object p0, p0, La/cu;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/nou;

    .line 87
    .line 88
    iput-object v7, v0, La/frt;->m:La/ocl;

    .line 89
    .line 90
    iput p1, v0, La/frt;->i:I

    .line 91
    .line 92
    iput-boolean p2, v0, La/frt;->l:Z

    .line 93
    .line 94
    iput p1, v0, La/frt;->j:I

    .line 95
    .line 96
    iput p2, v0, La/frt;->k:I

    .line 97
    .line 98
    iput v5, v0, La/frt;->p:I

    .line 99
    .line 100
    invoke-static {p0, v0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v1, :cond_4

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    move v6, p1

    .line 108
    move v2, p2

    .line 109
    move-object p2, p0

    .line 110
    move p0, v2

    .line 111
    :goto_1
    if-eqz p0, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    const/4 v5, 0x0

    .line 115
    :goto_2
    check-cast p2, La/ql5;

    .line 116
    .line 117
    iget-wide v8, p2, La/ql5;->e:J

    .line 118
    .line 119
    long-to-int p0, v8

    .line 120
    new-instance p2, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-direct {p2, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 123
    .line 124
    .line 125
    move v9, p1

    .line 126
    move-object v8, p2

    .line 127
    move p2, v2

    .line 128
    move p1, v6

    .line 129
    move-object p0, v7

    .line 130
    move v7, v5

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v9, p1

    .line 133
    move-object v8, v4

    .line 134
    move-object p0, v7

    .line 135
    move v7, p2

    .line 136
    :goto_3
    iput-object v4, v0, La/frt;->m:La/ocl;

    .line 137
    .line 138
    iput p1, v0, La/frt;->i:I

    .line 139
    .line 140
    iput-boolean p2, v0, La/frt;->l:Z

    .line 141
    .line 142
    iput v3, v0, La/frt;->p:I

    .line 143
    .line 144
    iget-object p0, p0, La/ocl;->a:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v6, p0

    .line 147
    check-cast v6, La/h0q0;

    .line 148
    .line 149
    iget-object p0, v6, La/h0q0;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, La/mne;

    .line 152
    .line 153
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 154
    .line 155
    new-instance v5, La/m9s0;

    .line 156
    .line 157
    const/4 v10, 0x0

    .line 158
    invoke-direct/range {v5 .. v10}, La/m9s0;-><init>(La/h0q0;ZLjava/lang/Integer;ILa/yje;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p0, v5, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v1, :cond_7

    .line 166
    .line 167
    :goto_4
    return-object v1

    .line 168
    :cond_7
    return-object p0
.end method

.method public k(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/hdu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/hdu;

    .line 7
    .line 8
    iget v1, v0, La/hdu;->m:I

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
    iput v1, v0, La/hdu;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hdu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/hdu;-><init>(La/cu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/hdu;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hdu;->m:I

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
    iget-wide p1, v0, La/hdu;->i:J

    .line 37
    .line 38
    iget-object p0, v0, La/hdu;->j:La/cu;

    .line 39
    .line 40
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p3, p0, La/cu;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, La/kwt;

    .line 57
    .line 58
    iget-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, La/ntu;

    .line 61
    .line 62
    invoke-virtual {v2}, La/ntu;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v4, p0, La/cu;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, La/k9c;

    .line 69
    .line 70
    invoke-virtual {v4}, La/k9c;->a()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    iput-object p0, v0, La/hdu;->j:La/cu;

    .line 75
    .line 76
    iput-wide p1, v0, La/hdu;->i:J

    .line 77
    .line 78
    iput v3, v0, La/hdu;->m:I

    .line 79
    .line 80
    iget-object p3, p3, La/kwt;->a:La/d0b;

    .line 81
    .line 82
    invoke-virtual {p3, v0, v2, v4}, La/d0b;->a(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-ne p3, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-wide/16 v0, 0x0

    .line 95
    .line 96
    cmp-long p0, p1, v0

    .line 97
    .line 98
    if-lez p0, :cond_6

    .line 99
    .line 100
    new-instance p0, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    :cond_4
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    move-object v1, v0

    .line 120
    check-cast v1, La/pbv;

    .line 121
    .line 122
    iget-object v1, v1, La/pbv;->e:La/a570;

    .line 123
    .line 124
    invoke-static {v1}, La/x1x;->D(La/a570;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    cmp-long v1, p1, v1

    .line 129
    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    return-object p0

    .line 137
    :cond_6
    return-object p3
.end method

.method public l(La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/cu;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/high16 v4, -0x80000000

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    instance-of v0, p1, La/tlu;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, La/tlu;

    .line 19
    .line 20
    iget v6, v0, La/tlu;->l:I

    .line 21
    .line 22
    and-int v7, v6, v4

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v4

    .line 27
    iput v6, v0, La/tlu;->l:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, La/tlu;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, La/tlu;-><init>(La/cu;La/zje;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, v0, La/tlu;->j:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v4, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v6, v0, La/tlu;->l:I

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    if-eq v6, v3, :cond_2

    .line 44
    .line 45
    if-ne v6, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_1
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_2
    iget-object p0, v0, La/tlu;->i:La/m0u;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/iqt;

    .line 67
    .line 68
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 69
    .line 70
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iget-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/m0u;

    .line 79
    .line 80
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, La/ahu;

    .line 83
    .line 84
    iput-object p1, v0, La/tlu;->i:La/m0u;

    .line 85
    .line 86
    iput v3, v0, La/tlu;->l:I

    .line 87
    .line 88
    invoke-static {p0, v0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v4, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move-object v11, p1

    .line 96
    move-object p1, p0

    .line 97
    move-object p0, v11

    .line 98
    :goto_1
    check-cast p1, La/ql5;

    .line 99
    .line 100
    iget-wide v2, p1, La/ql5;->e:J

    .line 101
    .line 102
    iput-object v5, v0, La/tlu;->i:La/m0u;

    .line 103
    .line 104
    iput v1, v0, La/tlu;->l:I

    .line 105
    .line 106
    iget-object p0, p0, La/m0u;->a:La/xr;

    .line 107
    .line 108
    invoke-virtual {p0, v2, v3, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v4, :cond_5

    .line 113
    .line 114
    :goto_2
    move-object v5, v4

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    :goto_3
    check-cast p1, La/xuf;

    .line 117
    .line 118
    new-instance v5, La/cht;

    .line 119
    .line 120
    iget-wide v0, p1, La/xuf;->i:D

    .line 121
    .line 122
    iget-object p0, p1, La/xuf;->f:Ljava/lang/String;

    .line 123
    .line 124
    invoke-direct {v5, p0, v0, v1}, La/cht;-><init>(Ljava/lang/String;D)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    new-instance v5, La/cht;

    .line 129
    .line 130
    const-wide p0, 0x3f847ae147ae147bL    # 0.01

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    const-string v0, ""

    .line 136
    .line 137
    invoke-direct {v5, v0, p0, p1}, La/cht;-><init>(Ljava/lang/String;D)V

    .line 138
    .line 139
    .line 140
    :goto_4
    return-object v5

    .line 141
    :sswitch_0
    instance-of v0, p1, La/jmt;

    .line 142
    .line 143
    if-eqz v0, :cond_7

    .line 144
    .line 145
    move-object v0, p1

    .line 146
    check-cast v0, La/jmt;

    .line 147
    .line 148
    iget v1, v0, La/jmt;->k:I

    .line 149
    .line 150
    and-int v6, v1, v4

    .line 151
    .line 152
    if-eqz v6, :cond_7

    .line 153
    .line 154
    sub-int/2addr v1, v4

    .line 155
    iput v1, v0, La/jmt;->k:I

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    new-instance v0, La/jmt;

    .line 159
    .line 160
    invoke-direct {v0, p0, p1}, La/jmt;-><init>(La/cu;La/zje;)V

    .line 161
    .line 162
    .line 163
    :goto_5
    iget-object p1, v0, La/jmt;->i:Ljava/lang/Object;

    .line 164
    .line 165
    sget-object v1, La/wne;->a:La/wne;

    .line 166
    .line 167
    iget v4, v0, La/jmt;->k:I

    .line 168
    .line 169
    const-string v6, "DAILY_TASK_FINISH_LAST_NOTIFICATION"

    .line 170
    .line 171
    if-eqz v4, :cond_9

    .line 172
    .line 173
    if-ne v4, v3, :cond_8

    .line 174
    .line 175
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_7

    .line 183
    .line 184
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 188
    .line 189
    .line 190
    move-result-wide v7

    .line 191
    iget-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, La/lsn;

    .line 194
    .line 195
    iget-object p1, p1, La/lsn;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p1, La/roi0;

    .line 198
    .line 199
    iget-object p1, p1, La/roi0;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p1, La/q7d0;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-wide/16 v9, 0x0

    .line 211
    .line 212
    invoke-interface {p1, v6, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 213
    .line 214
    .line 215
    move-result-wide v9

    .line 216
    sub-long/2addr v7, v9

    .line 217
    const-wide/32 v9, 0x5265c00

    .line 218
    .line 219
    .line 220
    cmp-long p1, v7, v9

    .line 221
    .line 222
    if-gtz p1, :cond_a

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_a
    iput v3, v0, La/jmt;->k:I

    .line 226
    .line 227
    iget-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, La/nmt;

    .line 230
    .line 231
    iget-object p1, p1, La/nmt;->a:La/kki;

    .line 232
    .line 233
    iget-object p1, p1, La/kki;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p1, La/o0j;

    .line 236
    .line 237
    iget-object p1, p1, La/o0j;->d:La/p7m0;

    .line 238
    .line 239
    new-instance v2, La/i89;

    .line 240
    .line 241
    const/16 v3, 0x16

    .line 242
    .line 243
    invoke-direct {v2, p1, v3}, La/i89;-><init>(La/gmq;B)V

    .line 244
    .line 245
    .line 246
    new-instance p1, La/i89;

    .line 247
    .line 248
    invoke-direct {p1, v2, v3}, La/i89;-><init>(La/gmq;B)V

    .line 249
    .line 250
    .line 251
    new-instance v2, La/fc4;

    .line 252
    .line 253
    const/4 v3, 0x7

    .line 254
    invoke-direct {v2, p1, v3}, La/fc4;-><init>(La/i89;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    if-ne p1, v1, :cond_b

    .line 262
    .line 263
    move-object v5, v1

    .line 264
    goto :goto_7

    .line 265
    :cond_b
    :goto_6
    check-cast p1, Ljava/lang/Iterable;

    .line 266
    .line 267
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_d

    .line 276
    .line 277
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object v1, v0

    .line 282
    check-cast v1, La/n85;

    .line 283
    .line 284
    invoke-virtual {v1}, La/ipm0;->f()Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_c

    .line 289
    .line 290
    iget-object v1, v1, La/n85;->g:La/wuo0;

    .line 291
    .line 292
    sget-object v2, La/wuo0;->c:La/wuo0;

    .line 293
    .line 294
    if-ne v1, v2, :cond_c

    .line 295
    .line 296
    move-object v5, v0

    .line 297
    :cond_d
    move-object p1, v5

    .line 298
    check-cast p1, La/n85;

    .line 299
    .line 300
    if-eqz p1, :cond_e

    .line 301
    .line 302
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p0, La/ljf0;

    .line 305
    .line 306
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast p0, La/roi0;

    .line 309
    .line 310
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 311
    .line 312
    .line 313
    move-result-wide v0

    .line 314
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p0, La/q7d0;

    .line 317
    .line 318
    invoke-virtual {p0, v6, v0, v1}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 319
    .line 320
    .line 321
    :cond_e
    :goto_7
    return-object v5

    .line 322
    :sswitch_1
    instance-of v0, p1, La/hnk;

    .line 323
    .line 324
    if-eqz v0, :cond_f

    .line 325
    .line 326
    move-object v0, p1

    .line 327
    check-cast v0, La/hnk;

    .line 328
    .line 329
    iget v6, v0, La/hnk;->k:I

    .line 330
    .line 331
    and-int v7, v6, v4

    .line 332
    .line 333
    if-eqz v7, :cond_f

    .line 334
    .line 335
    sub-int/2addr v6, v4

    .line 336
    iput v6, v0, La/hnk;->k:I

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_f
    new-instance v0, La/hnk;

    .line 340
    .line 341
    invoke-direct {v0, p0, p1}, La/hnk;-><init>(La/cu;La/zje;)V

    .line 342
    .line 343
    .line 344
    :goto_8
    iget-object p1, v0, La/hnk;->i:Ljava/lang/Object;

    .line 345
    .line 346
    sget-object v4, La/wne;->a:La/wne;

    .line 347
    .line 348
    iget v6, v0, La/hnk;->k:I

    .line 349
    .line 350
    const/4 v7, 0x3

    .line 351
    if-eqz v6, :cond_13

    .line 352
    .line 353
    if-eq v6, v3, :cond_12

    .line 354
    .line 355
    if-eq v6, v1, :cond_11

    .line 356
    .line 357
    if-ne v6, v7, :cond_10

    .line 358
    .line 359
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_10
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    goto :goto_d

    .line 367
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    iget-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p1, La/fhj;

    .line 381
    .line 382
    iput v3, v0, La/hnk;->k:I

    .line 383
    .line 384
    invoke-virtual {p1, v0}, La/fhj;->w(La/zje;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    if-ne p1, v4, :cond_14

    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_14
    :goto_9
    iget-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast p1, La/eqx;

    .line 394
    .line 395
    invoke-virtual {p1}, La/eqx;->b()V

    .line 396
    .line 397
    .line 398
    iput v1, v0, La/hnk;->k:I

    .line 399
    .line 400
    const-wide/16 v1, 0x3e8

    .line 401
    .line 402
    invoke-static {v1, v2, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    if-ne p1, v4, :cond_15

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_15
    :goto_a
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast p0, La/rou;

    .line 412
    .line 413
    iput v7, v0, La/hnk;->k:I

    .line 414
    .line 415
    invoke-virtual {p0, v3, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    if-ne p0, v4, :cond_16

    .line 420
    .line 421
    :goto_b
    move-object v5, v4

    .line 422
    goto :goto_d

    .line 423
    :cond_16
    :goto_c
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    :goto_d
    return-object v5

    .line 426
    :sswitch_2
    instance-of v0, p1, La/rp2;

    .line 427
    .line 428
    if-eqz v0, :cond_17

    .line 429
    .line 430
    move-object v0, p1

    .line 431
    check-cast v0, La/rp2;

    .line 432
    .line 433
    iget v6, v0, La/rp2;->m:I

    .line 434
    .line 435
    and-int v7, v6, v4

    .line 436
    .line 437
    if-eqz v7, :cond_17

    .line 438
    .line 439
    sub-int/2addr v6, v4

    .line 440
    iput v6, v0, La/rp2;->m:I

    .line 441
    .line 442
    goto :goto_e

    .line 443
    :cond_17
    new-instance v0, La/rp2;

    .line 444
    .line 445
    invoke-direct {v0, p0, p1}, La/rp2;-><init>(La/cu;La/zje;)V

    .line 446
    .line 447
    .line 448
    :goto_e
    iget-object p1, v0, La/rp2;->k:Ljava/lang/Object;

    .line 449
    .line 450
    sget-object v4, La/wne;->a:La/wne;

    .line 451
    .line 452
    iget v6, v0, La/rp2;->m:I

    .line 453
    .line 454
    if-eqz v6, :cond_1a

    .line 455
    .line 456
    if-eq v6, v3, :cond_19

    .line 457
    .line 458
    if-ne v6, v1, :cond_18

    .line 459
    .line 460
    iget-object p0, v0, La/rp2;->j:Ljava/util/Set;

    .line 461
    .line 462
    check-cast p0, Ljava/util/Set;

    .line 463
    .line 464
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 465
    .line 466
    .line 467
    goto/16 :goto_13

    .line 468
    .line 469
    :cond_18
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_15

    .line 473
    .line 474
    :cond_19
    iget-object p0, v0, La/rp2;->j:Ljava/util/Set;

    .line 475
    .line 476
    check-cast p0, Ljava/util/Set;

    .line 477
    .line 478
    iget-object v2, v0, La/rp2;->i:La/cu;

    .line 479
    .line 480
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 481
    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_1a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    iget-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast p1, La/gst0;

    .line 490
    .line 491
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-eqz p1, :cond_21

    .line 496
    .line 497
    :try_start_2
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 498
    .line 499
    iget-object p1, p0, La/cu;->c:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast p1, La/rrc;

    .line 502
    .line 503
    invoke-virtual {p1}, La/rrc;->y()Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    iget-object v2, p0, La/cu;->b:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v2, La/ywu;

    .line 510
    .line 511
    iput-object p0, v0, La/rp2;->i:La/cu;

    .line 512
    .line 513
    move-object v6, p1

    .line 514
    check-cast v6, Ljava/util/Set;

    .line 515
    .line 516
    iput-object v6, v0, La/rp2;->j:Ljava/util/Set;

    .line 517
    .line 518
    iput v3, v0, La/rp2;->m:I

    .line 519
    .line 520
    iget-object v3, v2, La/ywu;->b:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v3, La/mne;

    .line 523
    .line 524
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 525
    .line 526
    new-instance v6, La/uix;

    .line 527
    .line 528
    invoke-direct {v6, v2, v5}, La/uix;-><init>(La/ywu;La/yje;)V

    .line 529
    .line 530
    .line 531
    invoke-static {v3, v6, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    if-ne v2, v4, :cond_1b

    .line 536
    .line 537
    goto :goto_12

    .line 538
    :cond_1b
    move-object v11, v2

    .line 539
    move-object v2, p0

    .line 540
    move-object p0, p1

    .line 541
    move-object p1, v11

    .line 542
    :goto_f
    check-cast p1, Ljava/lang/Iterable;

    .line 543
    .line 544
    new-instance v3, Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 547
    .line 548
    .line 549
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    :cond_1c
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eqz v6, :cond_1d

    .line 558
    .line 559
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    move-object v7, v6

    .line 564
    check-cast v7, La/cf3;

    .line 565
    .line 566
    iget-object v7, v7, La/cf3;->b:Ljava/lang/String;

    .line 567
    .line 568
    invoke-interface {p0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    if-eqz v7, :cond_1c

    .line 573
    .line 574
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_1d
    new-instance p0, Ljava/util/ArrayList;

    .line 579
    .line 580
    const/16 p1, 0xa

    .line 581
    .line 582
    invoke-static {v3, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 583
    .line 584
    .line 585
    move-result p1

    .line 586
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    if-eqz v3, :cond_1e

    .line 598
    .line 599
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    check-cast v3, La/cf3;

    .line 604
    .line 605
    iget v3, v3, La/cf3;->a:I

    .line 606
    .line 607
    new-instance v6, Ljava/lang/Integer;

    .line 608
    .line 609
    invoke-direct {v6, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    goto :goto_11

    .line 616
    :cond_1e
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    if-eqz p1, :cond_1f

    .line 621
    .line 622
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 623
    .line 624
    goto :goto_15

    .line 625
    :cond_1f
    iget-object p1, v2, La/cu;->b:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast p1, La/ywu;

    .line 628
    .line 629
    iput-object v5, v0, La/rp2;->i:La/cu;

    .line 630
    .line 631
    iput-object v5, v0, La/rp2;->j:Ljava/util/Set;

    .line 632
    .line 633
    iput v1, v0, La/rp2;->m:I

    .line 634
    .line 635
    invoke-virtual {p1, p0, v0}, La/ywu;->B(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    if-ne p0, v4, :cond_20

    .line 640
    .line 641
    :goto_12
    move-object v5, v4

    .line 642
    goto :goto_15

    .line 643
    :cond_20
    :goto_13
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 644
    .line 645
    goto :goto_14

    .line 646
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 647
    .line 648
    :cond_21
    :goto_14
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    :goto_15
    return-object v5

    .line 651
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0x11 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public m(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p6, La/v7u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/v7u;

    .line 7
    .line 8
    iget v1, v0, La/v7u;->n:I

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
    iput v1, v0, La/v7u;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/v7u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/v7u;-><init>(La/cu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/v7u;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/v7u;->n:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-wide p0, v0, La/v7u;->k:J

    .line 38
    .line 39
    iget-object p2, v0, La/v7u;->j:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p4, v0, La/v7u;->i:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :cond_2
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p6, p0, La/cu;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p6, La/weu;

    .line 60
    .line 61
    invoke-virtual {p6, p1}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p1}, La/hdm0;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    iget-object p1, p0, La/cu;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, La/luu;

    .line 72
    .line 73
    iget-object p1, p1, La/luu;->a:La/nok0;

    .line 74
    .line 75
    invoke-virtual {p1}, La/nok0;->a()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p6

    .line 87
    if-eqz p6, :cond_4

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p6

    .line 93
    move-object v2, p6

    .line 94
    check-cast v2, La/lok0;

    .line 95
    .line 96
    iget v2, v2, La/lok0;->a:I

    .line 97
    .line 98
    int-to-long v7, v2

    .line 99
    cmp-long v2, v7, v5

    .line 100
    .line 101
    if-nez v2, :cond_3

    .line 102
    .line 103
    move-object v4, p6

    .line 104
    :cond_4
    check-cast v4, La/lok0;

    .line 105
    .line 106
    const-wide/16 v7, 0x28

    .line 107
    .line 108
    cmp-long p1, p2, v7

    .line 109
    .line 110
    if-nez p1, :cond_5

    .line 111
    .line 112
    const-string p1, ""

    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_5
    if-eqz v4, :cond_7

    .line 117
    .line 118
    iget-boolean p1, v4, La/lok0;->o:Z

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    iget-boolean p1, v4, La/lok0;->n:Z

    .line 123
    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    iget p1, v4, La/lok0;->a:I

    .line 127
    .line 128
    iget-object p5, v4, La/lok0;->u:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance p6, La/bzu;

    .line 134
    .line 135
    const/16 v2, 0x17

    .line 136
    .line 137
    invoke-direct {p6, v2}, La/bzu;-><init>(B)V

    .line 138
    .line 139
    .line 140
    const-string v2, "static"

    .line 141
    .line 142
    invoke-virtual {p6, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v2, "img"

    .line 146
    .line 147
    invoke-virtual {p6, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string v2, "android"

    .line 151
    .line 152
    invoke-virtual {p6, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string v2, "TopChamps"

    .line 156
    .line 157
    invoke-virtual {p6, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_6

    .line 165
    .line 166
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    :cond_6
    const-string p1, "backgrounds"

    .line 171
    .line 172
    const-string v2, "icon.svg"

    .line 173
    .line 174
    invoke-static {p6, p5, p1, v2}, La/axq;->u(La/bzu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p6, La/bzu;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto :goto_3

    .line 186
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    sget-object p6, La/ujn;->h:Ljava/lang/String;

    .line 189
    .line 190
    invoke-direct {p1, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result p6

    .line 200
    const/4 v2, 0x0

    .line 201
    if-nez p6, :cond_8

    .line 202
    .line 203
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_8
    sget-object p6, La/ujn;->h:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {p5, p6, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 210
    .line 211
    .line 212
    move-result p6

    .line 213
    if-nez p6, :cond_b

    .line 214
    .line 215
    const-string p6, "https://"

    .line 216
    .line 217
    invoke-static {p5, p6, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result p6

    .line 221
    if-eqz p6, :cond_9

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_9
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 225
    .line 226
    .line 227
    move-result p6

    .line 228
    const/16 v4, 0x2f

    .line 229
    .line 230
    if-lez p6, :cond_a

    .line 231
    .line 232
    const-string p6, "/"

    .line 233
    .line 234
    invoke-static {p1, p6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result p6

    .line 238
    if-nez p6, :cond_a

    .line 239
    .line 240
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    :cond_a
    new-array p6, v3, [C

    .line 244
    .line 245
    aput-char v4, p6, v2

    .line 246
    .line 247
    invoke-static {p5, p6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p5

    .line 251
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_b
    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    :goto_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :goto_3
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p0, La/r2u;

    .line 268
    .line 269
    iput-object p4, v0, La/v7u;->i:Ljava/lang/String;

    .line 270
    .line 271
    iput-object p1, v0, La/v7u;->j:Ljava/lang/String;

    .line 272
    .line 273
    iput-wide v5, v0, La/v7u;->k:J

    .line 274
    .line 275
    iput v3, v0, La/v7u;->n:I

    .line 276
    .line 277
    invoke-virtual {p0, p2, p3, v0}, La/r2u;->b(JLa/zje;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p6

    .line 281
    if-ne p6, v1, :cond_c

    .line 282
    .line 283
    return-object v1

    .line 284
    :cond_c
    move-object p2, p1

    .line 285
    move-wide p0, v5

    .line 286
    :goto_4
    check-cast p6, Ljava/lang/String;

    .line 287
    .line 288
    new-instance p3, La/ldm0;

    .line 289
    .line 290
    new-instance p5, La/ynm0;

    .line 291
    .line 292
    new-instance v0, La/ynq0;

    .line 293
    .line 294
    const-wide/16 v1, 0x0

    .line 295
    .line 296
    invoke-direct {v0, v1, v2}, La/ynq0;-><init>(J)V

    .line 297
    .line 298
    .line 299
    invoke-direct {p5, v0}, La/ynm0;-><init>(La/aoq0;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {p3, p6, p2, p4, p5}, La/ldm0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/bom0;)V

    .line 303
    .line 304
    .line 305
    new-instance p2, La/gdm0;

    .line 306
    .line 307
    invoke-direct {p2, p0, p1, p3}, La/gdm0;-><init>(JLa/odm0;)V

    .line 308
    .line 309
    .line 310
    return-object p2
.end method

.method public bridge synthetic n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, La/cu;->h(Landroidx/fragment/app/Fragment;La/iiy;)[J

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public o(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/cu;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/cmt;

    .line 4
    .line 5
    iget-object v0, v0, La/cmt;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/clc;

    .line 8
    .line 9
    iget-object v0, v0, La/clc;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/fjj;

    .line 12
    .line 13
    iget-object v0, v0, La/fjj;->b:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/qz40;

    .line 20
    .line 21
    check-cast v0, La/p7m0;

    .line 22
    .line 23
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/ljj;

    .line 28
    .line 29
    sget-object v1, La/ljj;->a:La/ljj;

    .line 30
    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    iget-object p0, p0, La/cu;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/peg0;

    .line 36
    .line 37
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/bbw0;

    .line 40
    .line 41
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, La/ht2;

    .line 44
    .line 45
    iget-object p0, p0, La/ht2;->a:La/p7m0;

    .line 46
    .line 47
    sget-object p1, La/iun;->a:La/iun;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/ok50;

    .line 56
    .line 57
    iget-object p0, p0, La/ok50;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/bbw0;

    .line 60
    .line 61
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/ht2;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, La/ht2;->a(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Null backendName"

    .line 7
    .line 8
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q(La/rs3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La/cu;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, [La/t7d;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, La/rs3;->b([La/t7d;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public r(La/yx5;La/iiy;[J)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, La/cu;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p2, p1, p3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, La/cu;->d:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/cu;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_1
    const-string v0, "Unbalanced call to unblock() detected."

    .line 22
    .line 23
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    monitor-exit p0

    .line 31
    throw v0
.end method
