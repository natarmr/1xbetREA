.class public final synthetic La/gbn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:S


# direct methods
.method public synthetic constructor <init>(La/fqh0;ZZLkotlin/jvm/functions/Function1;La/mm40;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/gbn0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gbn0;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/gbn0;->d:Z

    iput-boolean p3, p0, La/gbn0;->e:Z

    iput-object p4, p0, La/gbn0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/gbn0;->b:La/mm40;

    iput-short p6, p0, La/gbn0;->g:S

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;ZZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/gbn0;->a:B

    iput-object p1, p0, La/gbn0;->b:La/mm40;

    iput-object p2, p0, La/gbn0;->c:Ljava/lang/Object;

    iput-boolean p3, p0, La/gbn0;->d:Z

    iput-boolean p4, p0, La/gbn0;->e:Z

    iput-object p5, p0, La/gbn0;->f:Lkotlin/jvm/functions/Function1;

    iput-short p6, p0, La/gbn0;->g:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/gbn0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/gbn0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/fqh0;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-short p1, p0, La/gbn0;->g:S

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-boolean v2, p0, La/gbn0;->d:Z

    .line 28
    .line 29
    iget-boolean v3, p0, La/gbn0;->e:Z

    .line 30
    .line 31
    iget-object v4, p0, La/gbn0;->f:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v5, p0, La/gbn0;->b:La/mm40;

    .line 34
    .line 35
    invoke-static/range {v1 .. v7}, La/r8x;->w(La/fqh0;ZZLkotlin/jvm/functions/Function1;La/mm40;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, p0, La/gbn0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, La/a4x;

    .line 45
    .line 46
    move-object v6, p1

    .line 47
    check-cast v6, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-short p1, p0, La/gbn0;->g:S

    .line 55
    .line 56
    or-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {p1}, La/x8x;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget-object v1, p0, La/gbn0;->b:La/mm40;

    .line 63
    .line 64
    iget-boolean v3, p0, La/gbn0;->d:Z

    .line 65
    .line 66
    iget-boolean v4, p0, La/gbn0;->e:Z

    .line 67
    .line 68
    iget-object v5, p0, La/gbn0;->f:Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    invoke-static/range {v1 .. v7}, La/bsr0;->L(La/mm40;La/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    iget-object v0, p0, La/gbn0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    check-cast v2, La/a4x;

    .line 80
    .line 81
    move-object v6, p1

    .line 82
    check-cast v6, La/fet;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-short p1, p0, La/gbn0;->g:S

    .line 90
    .line 91
    or-int/lit8 p1, p1, 0x1

    .line 92
    .line 93
    invoke-static {p1}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iget-object v1, p0, La/gbn0;->b:La/mm40;

    .line 98
    .line 99
    iget-boolean v3, p0, La/gbn0;->d:Z

    .line 100
    .line 101
    iget-boolean v4, p0, La/gbn0;->e:Z

    .line 102
    .line 103
    iget-object v5, p0, La/gbn0;->f:Lkotlin/jvm/functions/Function1;

    .line 104
    .line 105
    invoke-static/range {v1 .. v7}, La/ccq0;->L(La/mm40;La/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
