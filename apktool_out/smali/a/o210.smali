.class public final synthetic La/o210;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/g2v;

.field public final synthetic e:La/xcz;

.field public final synthetic f:La/qdz;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;La/g2v;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/o210;->a:B

    iput-object p1, p0, La/o210;->b:La/l7m0;

    iput-object p2, p0, La/o210;->c:La/l7m0;

    iput-object p3, p0, La/o210;->d:La/g2v;

    iput-object p4, p0, La/o210;->e:La/xcz;

    iput-object p5, p0, La/o210;->f:La/qdz;

    iput-object p6, p0, La/o210;->g:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/o210;->h:Lkotlin/jvm/functions/Function0;

    iput p8, p0, La/o210;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/o210;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/o210;->i:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v1, p0, La/o210;->b:La/l7m0;

    .line 23
    .line 24
    iget-object v2, p0, La/o210;->c:La/l7m0;

    .line 25
    .line 26
    iget-object v3, p0, La/o210;->d:La/g2v;

    .line 27
    .line 28
    iget-object v4, p0, La/o210;->e:La/xcz;

    .line 29
    .line 30
    iget-object v5, p0, La/o210;->f:La/qdz;

    .line 31
    .line 32
    iget-object v6, p0, La/o210;->g:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    iget-object v7, p0, La/o210;->h:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    invoke-static/range {v1 .. v9}, La/b34;->o(La/l7m0;La/l7m0;La/g2v;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    iget p1, p0, La/o210;->i:I

    .line 51
    .line 52
    or-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    invoke-static {p1}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    iget-object v0, p0, La/o210;->b:La/l7m0;

    .line 59
    .line 60
    iget-object v1, p0, La/o210;->c:La/l7m0;

    .line 61
    .line 62
    iget-object v2, p0, La/o210;->d:La/g2v;

    .line 63
    .line 64
    iget-object v3, p0, La/o210;->e:La/xcz;

    .line 65
    .line 66
    iget-object v4, p0, La/o210;->f:La/qdz;

    .line 67
    .line 68
    iget-object v5, p0, La/o210;->g:Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    iget-object v6, p0, La/o210;->h:Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    invoke-static/range {v0 .. v8}, La/cy2;->f(La/l7m0;La/l7m0;La/g2v;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_1
    move-object v7, p1

    .line 79
    check-cast v7, La/fet;

    .line 80
    .line 81
    check-cast p2, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    iget p1, p0, La/o210;->i:I

    .line 87
    .line 88
    or-int/lit8 p1, p1, 0x1

    .line 89
    .line 90
    invoke-static {p1}, La/x8x;->L(I)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    iget-object v0, p0, La/o210;->b:La/l7m0;

    .line 95
    .line 96
    iget-object v1, p0, La/o210;->c:La/l7m0;

    .line 97
    .line 98
    iget-object v2, p0, La/o210;->d:La/g2v;

    .line 99
    .line 100
    iget-object v3, p0, La/o210;->e:La/xcz;

    .line 101
    .line 102
    iget-object v4, p0, La/o210;->f:La/qdz;

    .line 103
    .line 104
    iget-object v5, p0, La/o210;->g:Lkotlin/jvm/functions/Function1;

    .line 105
    .line 106
    iget-object v6, p0, La/o210;->h:Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    invoke-static/range {v0 .. v8}, La/phu0;->i(La/l7m0;La/l7m0;La/g2v;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
