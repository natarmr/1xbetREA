.class public final synthetic La/bn80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6n;

.field public final synthetic c:La/zfp;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/w6n;La/zfp;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/bn80;->a:B

    iput-object p1, p0, La/bn80;->b:La/w6n;

    iput-object p2, p0, La/bn80;->c:La/zfp;

    iput-object p3, p0, La/bn80;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/bn80;->a:B

    .line 2
    .line 3
    const-string v1, "FAVORITE_ICON"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/bn80;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object v5, p0, La/bn80;->c:La/zfp;

    .line 10
    .line 11
    iget-object p0, p0, La/bn80;->b:La/w6n;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    move v0, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v6

    .line 32
    :goto_0
    and-int/2addr p2, v3

    .line 33
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    iget-object p2, v5, La/zfp;->c:La/z9p;

    .line 40
    .line 41
    sget-object v0, La/cn80;->a:La/zfn;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/k6z;

    .line 48
    .line 49
    invoke-static {p0, p2, v0}, La/fww;->D(La/w6n;La/z9p;La/k6z;)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0, v5, v4, p1, v6}, La/wfp;->a(La/mm40;La/zfp;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 68
    .line 69
    if-eq v0, v2, :cond_2

    .line 70
    .line 71
    move v0, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v0, v6

    .line 74
    :goto_2
    and-int/2addr p2, v3

    .line 75
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    iget-object p2, v5, La/zfp;->c:La/z9p;

    .line 82
    .line 83
    sget-object v0, La/cn80;->a:La/zfn;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/k6z;

    .line 90
    .line 91
    invoke-static {p0, p2, v0}, La/fww;->D(La/w6n;La/z9p;La/k6z;)La/mm40;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0, v5, v4, p1, v6}, La/wfp;->a(La/mm40;La/zfp;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 110
    .line 111
    if-eq v0, v2, :cond_4

    .line 112
    .line 113
    move v0, v3

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move v0, v6

    .line 116
    :goto_4
    and-int/2addr p2, v3

    .line 117
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_5

    .line 122
    .line 123
    iget-object p2, v5, La/zfp;->c:La/z9p;

    .line 124
    .line 125
    sget-object v0, La/cn80;->a:La/zfn;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, La/k6z;

    .line 132
    .line 133
    invoke-static {p0, p2, v0}, La/fww;->D(La/w6n;La/z9p;La/k6z;)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0, v5, v4, p1, v6}, La/wfp;->a(La/mm40;La/zfp;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
