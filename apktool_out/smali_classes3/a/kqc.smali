.class public final La/kqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kqc;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/kqc;->b:La/pbt;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/kqc;->b:La/pbt;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/kqc;->b:La/pbt;

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/sub0;
    .locals 3

    .line 1
    iget-byte v0, p0, La/kqc;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/kqc;->b:La/pbt;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/pbt;->e:La/uub0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, La/sub0;->b:La/nh70;

    .line 15
    .line 16
    iget-object p0, p0, La/uub0;->a:La/q7d0;

    .line 17
    .line 18
    const-string v2, "PreviewServiceStatusLocalDataSource.PREVIEW_KEY"

    .line 19
    .line 20
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/nh70;->g(I)La/sub0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    iget-object p0, p0, La/pbt;->e:La/uub0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v0, La/sub0;->b:La/nh70;

    .line 42
    .line 43
    iget-object p0, p0, La/uub0;->a:La/q7d0;

    .line 44
    .line 45
    const-string v2, "PreviewServiceStatusLocalDataSource.ACTIONS_KEY"

    .line 46
    .line 47
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, La/nh70;->g(I)La/sub0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
