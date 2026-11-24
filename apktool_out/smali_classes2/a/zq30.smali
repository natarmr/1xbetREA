.class public final La/zq30;
.super La/ar30;
.source "SourceFile"


# static fields
.field public static final d:La/zq30;

.field public static final e:La/zq30;


# instance fields
.field public final synthetic c:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/zq30;

    .line 2
    .line 3
    const-string v1, "must be a member function"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/zq30;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/zq30;->d:La/zq30;

    .line 10
    .line 11
    new-instance v0, La/zq30;

    .line 12
    .line 13
    const-string v1, "must be a member or an extension function"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, La/zq30;-><init>(Ljava/lang/String;B)V

    .line 17
    .line 18
    .line 19
    sput-object v0, La/zq30;->e:La/zq30;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zq30;->c:B

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, La/ar30;-><init>(Ljava/lang/String;B)V

    return-void
.end method


# virtual methods
.method public final b(La/u9y;)Z
    .locals 2

    .line 1
    iget-byte p0, p0, La/zq30;->c:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p1, La/oer;->k:La/c8z;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    iget-object p0, p1, La/oer;->j:La/c8z;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :cond_1
    :goto_0
    return v0

    .line 19
    :pswitch_0
    iget-object p0, p1, La/oer;->k:La/c8z;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move v0, v1

    .line 25
    :goto_1
    return v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
