.class public final La/wtt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;B)V
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
    iput-object p1, p0, La/wtt;->a:La/pbt;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/wtt;->a:La/pbt;

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
.method public a()Z
    .locals 6

    .line 1
    iget-object p0, p0, La/wtt;->a:La/pbt;

    .line 2
    .line 3
    iget-object v0, p0, La/pbt;->d:La/p2t;

    .line 4
    .line 5
    invoke-virtual {v0}, La/p2t;->a()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    move-object v4, v3

    .line 28
    check-cast v4, La/rq60;

    .line 29
    .line 30
    iget v4, v4, La/rq60;->a:I

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    if-ne v4, v5, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_0
    check-cast v3, La/rq60;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-boolean v0, v3, La/rq60;->d:Z

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v0, v1

    .line 48
    :goto_1
    iget-object p0, p0, La/pbt;->e:La/uub0;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v3, La/sub0;->b:La/nh70;

    .line 54
    .line 55
    iget-object p0, p0, La/uub0;->a:La/q7d0;

    .line 56
    .line 57
    const-string v4, "PreviewServiceStatusLocalDataSource.ACTIONS_KEY"

    .line 58
    .line 59
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p0, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, La/nh70;->g(I)La/sub0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object v3, La/sub0;->f:La/sub0;

    .line 75
    .line 76
    if-ne p0, v3, :cond_3

    .line 77
    .line 78
    move p0, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move p0, v1

    .line 81
    :goto_2
    if-nez v0, :cond_5

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    return v1

    .line 87
    :cond_5
    :goto_3
    return v2
.end method
