.class public final synthetic La/r5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(IZLa/qao0;La/a4x;ZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p8, p0, La/r5n;->a:B

    iput p1, p0, La/r5n;->b:I

    iput-boolean p2, p0, La/r5n;->c:Z

    iput-object p3, p0, La/r5n;->d:Ljava/lang/Object;

    iput-object p4, p0, La/r5n;->e:Ljava/lang/Object;

    iput-boolean p5, p0, La/r5n;->f:Z

    iput-object p6, p0, La/r5n;->g:Lkotlin/jvm/functions/Function1;

    iput p7, p0, La/r5n;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/ope;IZZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/r5n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r5n;->d:Ljava/lang/Object;

    iput-object p2, p0, La/r5n;->e:Ljava/lang/Object;

    iput p3, p0, La/r5n;->b:I

    iput-boolean p4, p0, La/r5n;->c:Z

    iput-boolean p5, p0, La/r5n;->f:Z

    iput-object p6, p0, La/r5n;->g:Lkotlin/jvm/functions/Function1;

    iput p7, p0, La/r5n;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/r5n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/r5n;->h:I

    .line 4
    .line 5
    iget-object v2, p0, La/r5n;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/r5n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, La/mm40;

    .line 14
    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, La/ope;

    .line 17
    .line 18
    move-object v10, p1

    .line 19
    check-cast v10, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    iget v6, p0, La/r5n;->b:I

    .line 33
    .line 34
    iget-boolean v7, p0, La/r5n;->c:Z

    .line 35
    .line 36
    iget-boolean v8, p0, La/r5n;->f:Z

    .line 37
    .line 38
    iget-object v9, p0, La/r5n;->g:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    invoke-static/range {v4 .. v11}, La/l8x;->m(La/mm40;La/ope;IZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast v3, La/qao0;

    .line 47
    .line 48
    check-cast v2, La/a4x;

    .line 49
    .line 50
    move-object v6, p1

    .line 51
    check-cast v6, La/fet;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    or-int/lit8 p1, v1, 0x1

    .line 59
    .line 60
    invoke-static {p1}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    iget v0, p0, La/r5n;->b:I

    .line 65
    .line 66
    iget-boolean v1, p0, La/r5n;->c:Z

    .line 67
    .line 68
    iget-boolean v4, p0, La/r5n;->f:Z

    .line 69
    .line 70
    iget-object v5, p0, La/r5n;->g:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    move-object v12, v3

    .line 73
    move-object v3, v2

    .line 74
    move-object v2, v12

    .line 75
    invoke-static/range {v0 .. v7}, La/z5n;->l(IZLa/qao0;La/a4x;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast v3, La/qao0;

    .line 82
    .line 83
    check-cast v2, La/a4x;

    .line 84
    .line 85
    move-object v6, p1

    .line 86
    check-cast v6, La/fet;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    or-int/lit8 p1, v1, 0x1

    .line 94
    .line 95
    invoke-static {p1}, La/x8x;->L(I)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    iget v0, p0, La/r5n;->b:I

    .line 100
    .line 101
    iget-boolean v1, p0, La/r5n;->c:Z

    .line 102
    .line 103
    iget-boolean v4, p0, La/r5n;->f:Z

    .line 104
    .line 105
    iget-object v5, p0, La/r5n;->g:Lkotlin/jvm/functions/Function1;

    .line 106
    .line 107
    move-object v12, v3

    .line 108
    move-object v3, v2

    .line 109
    move-object v2, v12

    .line 110
    invoke-static/range {v0 .. v7}, La/z5n;->j(IZLa/qao0;La/a4x;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
