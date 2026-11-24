.class public final La/eot;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/pbt;La/gst0;B)V
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
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/eot;->a:La/pbt;

    .line 14
    .line 15
    iput-object p2, p0, La/eot;->b:La/gst0;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/eot;->a:La/pbt;

    .line 22
    .line 23
    iput-object p2, p0, La/eot;->b:La/gst0;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/eou;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/eou;

    .line 7
    .line 8
    iget v1, v0, La/eou;->k:I

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
    iput v1, v0, La/eou;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/eou;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/eou;-><init>(La/eot;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/eou;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/eou;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/eot;->b:La/gst0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput v4, v0, La/eou;->k:I

    .line 57
    .line 58
    iget-object p0, p0, La/eot;->a:La/pbt;

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/pbt;->k(ZLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object v0, p1

    .line 84
    check-cast v0, La/rq60;

    .line 85
    .line 86
    sget-object v1, La/d270;->b:La/evz;

    .line 87
    .line 88
    iget v0, v0, La/rq60;->a:I

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, La/evz;->c(I)La/d270;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, La/d270;->c:La/d270;

    .line 98
    .line 99
    if-ne v0, v1, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    move-object p1, v3

    .line 103
    :goto_2
    check-cast p1, La/rq60;

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    new-instance p0, La/cfb0;

    .line 108
    .line 109
    iget-object v0, p1, La/rq60;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, p1, La/rq60;->c:Ljava/lang/String;

    .line 112
    .line 113
    iget-boolean p1, p1, La/rq60;->d:Z

    .line 114
    .line 115
    invoke-direct {p0, v0, v1, p1}, La/cfb0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_6
    return-object v3
.end method
