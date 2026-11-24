.class public final La/vyt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hm7;


# direct methods
.method public constructor <init>(La/hm7;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/vyt;->a:La/hm7;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/vyt;->a:La/hm7;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/ezc;
    .locals 2

    .line 1
    iget-object p0, p0, La/vyt;->a:La/hm7;

    .line 2
    .line 3
    iget-object p0, p0, La/hm7;->a:La/h03;

    .line 4
    .line 5
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/vwb0;

    .line 8
    .line 9
    sget-object v0, La/ezc;->b:La/ezc;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "bet_check_koef"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v0, 0x1

    .line 26
    if-eq p0, v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    if-eq p0, v0, :cond_0

    .line 30
    .line 31
    sget-object p0, La/ezc;->b:La/ezc;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    sget-object p0, La/ezc;->d:La/ezc;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object p0, La/ezc;->c:La/ezc;

    .line 38
    .line 39
    return-object p0
.end method
