.class public final synthetic La/g6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/w6b;

.field public final synthetic d:La/xcz;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/ugd;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/w6b;La/xcz;Lkotlin/jvm/functions/Function1;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/g6b;->a:B

    iput-object p1, p0, La/g6b;->b:La/mm40;

    iput-object p2, p0, La/g6b;->c:La/w6b;

    iput-object p3, p0, La/g6b;->d:La/xcz;

    iput-object p4, p0, La/g6b;->e:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/g6b;->f:La/ugd;

    iput p6, p0, La/g6b;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/g6b;->a:B

    .line 2
    .line 3
    iget v1, p0, La/g6b;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v2, p0, La/g6b;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/g6b;->c:La/w6b;

    .line 25
    .line 26
    iget-object v4, p0, La/g6b;->d:La/xcz;

    .line 27
    .line 28
    iget-object v5, p0, La/g6b;->e:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iget-object v6, p0, La/g6b;->f:La/ugd;

    .line 31
    .line 32
    invoke-static/range {v2 .. v8}, La/hew0;->g(La/mm40;La/w6b;La/xcz;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    move-object v5, p1

    .line 39
    check-cast v5, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 p1, v1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v0, p0, La/g6b;->b:La/mm40;

    .line 53
    .line 54
    iget-object v1, p0, La/g6b;->c:La/w6b;

    .line 55
    .line 56
    iget-object v2, p0, La/g6b;->d:La/xcz;

    .line 57
    .line 58
    iget-object v3, p0, La/g6b;->e:Lkotlin/jvm/functions/Function1;

    .line 59
    .line 60
    iget-object v4, p0, La/g6b;->f:La/ugd;

    .line 61
    .line 62
    invoke-static/range {v0 .. v6}, La/vbw0;->l(La/mm40;La/w6b;La/xcz;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_1
    move-object v5, p1

    .line 69
    check-cast v5, La/fet;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    or-int/lit8 p1, v1, 0x1

    .line 77
    .line 78
    invoke-static {p1}, La/x8x;->L(I)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    iget-object v0, p0, La/g6b;->b:La/mm40;

    .line 83
    .line 84
    iget-object v1, p0, La/g6b;->c:La/w6b;

    .line 85
    .line 86
    iget-object v2, p0, La/g6b;->d:La/xcz;

    .line 87
    .line 88
    iget-object v3, p0, La/g6b;->e:Lkotlin/jvm/functions/Function1;

    .line 89
    .line 90
    iget-object v4, p0, La/g6b;->f:La/ugd;

    .line 91
    .line 92
    invoke-static/range {v0 .. v6}, La/i4w0;->n(La/mm40;La/w6b;La/xcz;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_2
    move-object v5, p1

    .line 99
    check-cast v5, La/fet;

    .line 100
    .line 101
    check-cast p2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    or-int/lit8 p1, v1, 0x1

    .line 107
    .line 108
    invoke-static {p1}, La/x8x;->L(I)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    iget-object v0, p0, La/g6b;->b:La/mm40;

    .line 113
    .line 114
    iget-object v1, p0, La/g6b;->c:La/w6b;

    .line 115
    .line 116
    iget-object v2, p0, La/g6b;->d:La/xcz;

    .line 117
    .line 118
    iget-object v3, p0, La/g6b;->e:Lkotlin/jvm/functions/Function1;

    .line 119
    .line 120
    iget-object v4, p0, La/g6b;->f:La/ugd;

    .line 121
    .line 122
    invoke-static/range {v0 .. v6}, La/epv0;->j(La/mm40;La/w6b;La/xcz;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
