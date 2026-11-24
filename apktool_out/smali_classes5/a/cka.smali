.class public final synthetic La/cka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/ugd;

.field public final synthetic e:La/ugd;

.field public final synthetic f:La/ugd;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/cka;->a:B

    iput-object p1, p0, La/cka;->b:La/mm40;

    iput-object p2, p0, La/cka;->c:La/ugd;

    iput-object p3, p0, La/cka;->d:La/ugd;

    iput-object p4, p0, La/cka;->e:La/ugd;

    iput-object p5, p0, La/cka;->f:La/ugd;

    iput p6, p0, La/cka;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/cka;->a:B

    .line 2
    .line 3
    iget v1, p0, La/cka;->g:I

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
    iget-object v2, p0, La/cka;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/cka;->c:La/ugd;

    .line 25
    .line 26
    iget-object v4, p0, La/cka;->d:La/ugd;

    .line 27
    .line 28
    iget-object v5, p0, La/cka;->e:La/ugd;

    .line 29
    .line 30
    iget-object v6, p0, La/cka;->f:La/ugd;

    .line 31
    .line 32
    invoke-static/range {v2 .. v8}, La/d7x;->h(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

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
    iget-object v0, p0, La/cka;->b:La/mm40;

    .line 53
    .line 54
    iget-object v1, p0, La/cka;->c:La/ugd;

    .line 55
    .line 56
    iget-object v2, p0, La/cka;->d:La/ugd;

    .line 57
    .line 58
    iget-object v3, p0, La/cka;->e:La/ugd;

    .line 59
    .line 60
    iget-object v4, p0, La/cka;->f:La/ugd;

    .line 61
    .line 62
    invoke-static/range {v0 .. v6}, La/z1x;->f(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

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
    iget-object v0, p0, La/cka;->b:La/mm40;

    .line 83
    .line 84
    iget-object v1, p0, La/cka;->c:La/ugd;

    .line 85
    .line 86
    iget-object v2, p0, La/cka;->d:La/ugd;

    .line 87
    .line 88
    iget-object v3, p0, La/cka;->e:La/ugd;

    .line 89
    .line 90
    iget-object v4, p0, La/cka;->f:La/ugd;

    .line 91
    .line 92
    invoke-static/range {v0 .. v6}, La/fka;->b(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
