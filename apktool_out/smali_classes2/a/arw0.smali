.class public final La/arw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mff0;


# static fields
.field public static final c:La/arw0;

.field public static final d:La/arw0;

.field public static final e:La/arw0;

.field public static final f:La/arw0;

.field public static final g:La/arw0;

.field public static final h:La/arw0;

.field public static final i:La/arw0;

.field public static final j:La/arw0;

.field public static final k:La/arw0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/arw0;

    .line 2
    .line 3
    const-string v1, "TINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/arw0;->c:La/arw0;

    .line 10
    .line 11
    new-instance v0, La/arw0;

    .line 12
    .line 13
    const-string v1, "CRUNCHY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/arw0;->d:La/arw0;

    .line 19
    .line 20
    new-instance v0, La/arw0;

    .line 21
    .line 22
    const-string v1, "NO_PREFIX"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/arw0;->e:La/arw0;

    .line 28
    .line 29
    new-instance v0, La/arw0;

    .line 30
    .line 31
    const-string v1, "TINK"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/arw0;->f:La/arw0;

    .line 38
    .line 39
    new-instance v0, La/arw0;

    .line 40
    .line 41
    const-string v1, "NO_PREFIX"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/arw0;->g:La/arw0;

    .line 47
    .line 48
    new-instance v0, La/arw0;

    .line 49
    .line 50
    const-string v1, "TINK"

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/arw0;->h:La/arw0;

    .line 57
    .line 58
    new-instance v0, La/arw0;

    .line 59
    .line 60
    const-string v1, "CRUNCHY"

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 63
    .line 64
    .line 65
    sput-object v0, La/arw0;->i:La/arw0;

    .line 66
    .line 67
    new-instance v0, La/arw0;

    .line 68
    .line 69
    const-string v1, "LEGACY"

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 72
    .line 73
    .line 74
    sput-object v0, La/arw0;->j:La/arw0;

    .line 75
    .line 76
    new-instance v0, La/arw0;

    .line 77
    .line 78
    const-string v1, "NO_PREFIX"

    .line 79
    .line 80
    invoke-direct {v0, v1, v2}, La/arw0;-><init>(Ljava/lang/String;B)V

    .line 81
    .line 82
    .line 83
    sput-object v0, La/arw0;->k:La/arw0;

    .line 84
    .line 85
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/arw0;->a:B

    iput-object p1, p0, La/arw0;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    check-cast p1, La/i0x0;

    .line 4
    .line 5
    sget v0, La/tzw0;->l:I

    .line 6
    .line 7
    new-instance v0, La/izw0;

    .line 8
    .line 9
    invoke-direct {v0, p2}, La/izw0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, La/h0x0;

    .line 17
    .line 18
    invoke-virtual {p1}, La/y4w0;->G()Landroid/os/Parcel;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p2, v0}, La/wmw0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/arw0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p2, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x5

    .line 31
    invoke-virtual {p1, p2, p0}, La/y4w0;->H(Landroid/os/Parcel;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/arw0;->a:B

    iget-object v1, p0, La/arw0;->b:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
