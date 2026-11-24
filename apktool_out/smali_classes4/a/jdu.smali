.class public final La/jdu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/pbt;La/gst0;B)V
    .locals 0

    .line 1
    packed-switch p3, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jdu;->a:La/pbt;

    .line 14
    .line 15
    iput-object p2, p0, La/jdu;->b:La/gst0;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/jdu;->a:La/pbt;

    .line 28
    .line 29
    iput-object p2, p0, La/jdu;->b:La/gst0;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/jdu;->a:La/pbt;

    .line 36
    .line 37
    iput-object p2, p0, La/jdu;->b:La/gst0;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/zje;Ljava/lang/String;ZZ)Ljava/io/Serializable;
    .locals 7

    .line 1
    instance-of v0, p1, La/idu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/idu;

    .line 7
    .line 8
    iget v1, v0, La/idu;->k:I

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
    iput v1, v0, La/idu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/idu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/idu;-><init>(La/jdu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, La/idu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/idu;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/jdu;->b:La/gst0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    iput v2, v6, La/idu;->k:I

    .line 59
    .line 60
    iget-object v1, p0, La/jdu;->a:La/pbt;

    .line 61
    .line 62
    move-object v3, p2

    .line 63
    move v2, p3

    .line 64
    move v5, p4

    .line 65
    invoke-virtual/range {v1 .. v6}, La/pbt;->o(ZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_2
    check-cast p1, La/p070;

    .line 73
    .line 74
    iget-object p0, p1, La/p070;->b:Ljava/util/List;

    .line 75
    .line 76
    new-instance p2, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    if-eqz p3, :cond_7

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    move-object p4, p3

    .line 96
    check-cast p4, La/f8b;

    .line 97
    .line 98
    iget-object v0, p1, La/p070;->a:Ljava/util/List;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, La/pbv;

    .line 124
    .line 125
    iget-object v1, v1, La/pbv;->b:Ljava/util/List;

    .line 126
    .line 127
    iget v2, p4, La/f8b;->a:I

    .line 128
    .line 129
    invoke-static {v2, v1}, La/rz4;->C(ILjava/util/List;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    return-object p2
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/lmu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/lmu;

    .line 7
    .line 8
    iget v1, v0, La/lmu;->k:I

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
    iput v1, v0, La/lmu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lmu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/lmu;-><init>(La/jdu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/lmu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lmu;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/jdu;->b:La/gst0;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput v4, v0, La/lmu;->k:I

    .line 57
    .line 58
    iget-object p0, p0, La/jdu;->a:La/pbt;

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
    new-instance p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 v0, 0xa

    .line 72
    .line 73
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/rq60;

    .line 95
    .line 96
    iget v0, v0, La/rq60;->a:I

    .line 97
    .line 98
    new-instance v1, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    new-instance p1, Ljava/lang/Integer;

    .line 108
    .line 109
    const/16 v0, 0x8

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_5

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    const/4 v4, 0x0

    .line 128
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method public c(ZLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/jkt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/jkt0;

    .line 7
    .line 8
    iget v1, v0, La/jkt0;->k:I

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
    iput v1, v0, La/jkt0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/jkt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/jkt0;-><init>(La/jdu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/jkt0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/jkt0;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/jdu;->b:La/gst0;

    .line 51
    .line 52
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput v4, v0, La/jkt0;->k:I

    .line 57
    .line 58
    iget-object p0, p0, La/jdu;->a:La/pbt;

    .line 59
    .line 60
    iget-object v2, p0, La/pbt;->m:La/mne;

    .line 61
    .line 62
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 63
    .line 64
    new-instance v4, La/ebt;

    .line 65
    .line 66
    invoke-direct {v4, p1, p0, p2, v3}, La/ebt;-><init>(ZLa/pbt;ZLa/yje;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v4, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0
.end method
