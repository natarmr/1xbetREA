.class public final synthetic La/edj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final synthetic b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final synthetic c:Ljava/util/Locale;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:La/vne;

.field public final synthetic h:La/pz40;

.field public final synthetic i:La/cgk0;

.field public final synthetic j:La/pz40;

.field public final synthetic k:La/kwj;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;IILkotlin/jvm/functions/Function1;La/vne;La/pz40;La/cgk0;La/pz40;La/kwj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/edj;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    iput-object p2, p0, La/edj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    iput-object p3, p0, La/edj;->c:Ljava/util/Locale;

    iput p4, p0, La/edj;->d:I

    iput p5, p0, La/edj;->e:I

    iput-object p6, p0, La/edj;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/edj;->g:La/vne;

    iput-object p8, p0, La/edj;->h:La/pz40;

    iput-object p9, p0, La/edj;->i:La/cgk0;

    iput-object p10, p0, La/edj;->j:La/pz40;

    iput-object p11, p0, La/edj;->k:La/kwj;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/w2w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p1, La/w2w0;->a:I

    .line 7
    .line 8
    iget-object v1, p0, La/edj;->h:La/pz40;

    .line 9
    .line 10
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/w2w0;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, La/w2w0;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-interface {v1, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/edj;->i:La/cgk0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget p1, p1, La/w2w0;->b:I

    .line 35
    .line 36
    iget-object v2, p0, La/edj;->c:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/util/Calendar;->clear()V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-virtual {v3, v4, v0}, Ljava/util/Calendar;->set(II)V

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    invoke-virtual {v3, v5, p1}, Ljava/util/Calendar;->set(II)V

    .line 51
    .line 52
    .line 53
    const/4 v5, 0x5

    .line 54
    invoke-virtual {v3, v5, v4}, Ljava/util/Calendar;->set(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v1, v4, v3}, La/l1e0;->d(III)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    new-instance v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 66
    .line 67
    add-int/2addr p1, v4

    .line 68
    invoke-direct {v3, v0, p1, v1}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, La/edj;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 72
    .line 73
    invoke-static {p1, v2}, La/wdx;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, La/bsr0;->U(Ljava/util/Calendar;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    iget-object v5, p0, La/edj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 85
    .line 86
    invoke-static {v5, v2}, La/wdx;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {v6}, La/bsr0;->U(Ljava/util/Calendar;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    cmp-long v8, v0, v6

    .line 98
    .line 99
    if-lez v8, :cond_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-static {v3, v2}, La/wdx;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-static {v8}, La/bsr0;->U(Ljava/util/Calendar;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v8

    .line 113
    cmp-long v0, v8, v0

    .line 114
    .line 115
    if-gez v0, :cond_2

    .line 116
    .line 117
    :goto_0
    move-object v3, p1

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    cmp-long p1, v8, v6

    .line 120
    .line 121
    if-lez p1, :cond_3

    .line 122
    .line 123
    move-object v3, v5

    .line 124
    :cond_3
    :goto_1
    invoke-static {v3, v2}, La/wdx;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, La/wdx;->j0(Ljava/util/Calendar;)La/w2w0;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, La/bsr0;->m0(La/w2w0;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget v1, p0, La/edj;->d:I

    .line 137
    .line 138
    sub-int/2addr v0, v1

    .line 139
    const/4 v1, 0x0

    .line 140
    iget v5, p0, La/edj;->e:I

    .line 141
    .line 142
    sub-int/2addr v5, v4

    .line 143
    invoke-static {v0, v1, v5}, La/l1e0;->d(III)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iget-object v1, p0, La/edj;->j:La/pz40;

    .line 148
    .line 149
    invoke-interface {v1, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v2}, La/wdx;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p1}, La/bsr0;->U(Ljava/util/Calendar;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-object v1, p0, La/edj;->f:Lkotlin/jvm/functions/Function1;

    .line 168
    .line 169
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    new-instance p1, La/gjg;

    .line 173
    .line 174
    iget-object v1, p0, La/edj;->k:La/kwj;

    .line 175
    .line 176
    const/4 v2, 0x0

    .line 177
    invoke-direct {p1, v1, v0, v2, v4}, La/gjg;-><init>(La/kwj;ILa/yje;B)V

    .line 178
    .line 179
    .line 180
    const/4 v0, 0x3

    .line 181
    iget-object p0, p0, La/edj;->g:La/vne;

    .line 182
    .line 183
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 184
    .line 185
    .line 186
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0
.end method
