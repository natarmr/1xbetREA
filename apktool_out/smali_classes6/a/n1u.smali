.class public final La/n1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dgu;


# direct methods
.method public synthetic constructor <init>(La/dgu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n1u;->a:La/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p3, La/pkt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/pkt0;

    .line 7
    .line 8
    iget v1, v0, La/pkt0;->k:I

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
    iput v1, v0, La/pkt0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pkt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/pkt0;-><init>(La/n1u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/pkt0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pkt0;->k:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v4

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/pkt0;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/n1u;->a:La/dgu;

    .line 53
    .line 54
    iget-object p3, p0, La/dgu;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, La/mne;

    .line 57
    .line 58
    iget-object p3, p3, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v2, La/fns;

    .line 61
    .line 62
    invoke-direct {v2, v4, p0, p1, p2}, La/fns;-><init>(La/yje;La/dgu;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p3, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-ne p3, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p3, La/qcv;

    .line 73
    .line 74
    iget-object p0, p3, La/qcv;->b:Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object p1, p3, La/qcv;->c:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_5

    .line 87
    .line 88
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    move-object v0, p3

    .line 93
    check-cast v0, La/ajh0;

    .line 94
    .line 95
    iget-boolean v0, v0, La/ajh0;->c:Z

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    move-object v4, p3

    .line 100
    :cond_5
    check-cast v4, La/ajh0;

    .line 101
    .line 102
    if-nez v4, :cond_6

    .line 103
    .line 104
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    move-object v4, p1

    .line 109
    check-cast v4, La/ajh0;

    .line 110
    .line 111
    if-nez v4, :cond_6

    .line 112
    .line 113
    sget-object p0, La/iun;->a:La/iun;

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_8

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    move-object p3, p2

    .line 136
    check-cast p3, La/jcv;

    .line 137
    .line 138
    iget-object v0, v4, La/ajh0;->b:Ljava/lang/String;

    .line 139
    .line 140
    iget-object p3, p3, La/jcv;->g:Ljava/lang/String;

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-static {v0, p3, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-eqz p3, :cond_7

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_8
    return-object p1
.end method
