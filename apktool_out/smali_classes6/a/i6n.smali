.class public final synthetic La/i6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/i6n;->a:B

    iput-object p4, p0, La/i6n;->e:Ljava/lang/Object;

    iput p2, p0, La/i6n;->b:I

    iput-object p5, p0, La/i6n;->c:Ljava/lang/Object;

    iput p3, p0, La/i6n;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILa/a4x;La/zhr0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/i6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/i6n;->b:I

    iput-object p2, p0, La/i6n;->e:Ljava/lang/Object;

    iput-object p3, p0, La/i6n;->c:Ljava/lang/Object;

    iput p4, p0, La/i6n;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/fro0;La/mm40;III)V
    .locals 0

    .line 3
    const/4 p5, 0x0

    iput-byte p5, p0, La/i6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/i6n;->e:Ljava/lang/Object;

    iput-object p2, p0, La/i6n;->c:Ljava/lang/Object;

    iput p3, p0, La/i6n;->b:I

    iput p4, p0, La/i6n;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/i6n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/i6n;->d:I

    .line 4
    .line 5
    iget v2, p0, La/i6n;->b:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/i6n;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, La/i6n;->e:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, La/a4x;

    .line 16
    .line 17
    check-cast v4, La/zhr0;

    .line 18
    .line 19
    check-cast p1, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    or-int/lit8 p0, v1, 0x1

    .line 27
    .line 28
    invoke-static {p0}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v2, v5, v4, p1, p0}, La/nia0;->X(ILa/a4x;La/zhr0;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast v5, La/fop0;

    .line 39
    .line 40
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    check-cast p1, La/fet;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    or-int/lit8 p0, v1, 0x1

    .line 50
    .line 51
    invoke-static {p0}, La/x8x;->L(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {v5, v2, v4, p1, p0}, La/hfm0;->n(La/fop0;ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast v5, Ljava/util/List;

    .line 62
    .line 63
    check-cast v4, La/mm40;

    .line 64
    .line 65
    check-cast p1, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    or-int/lit8 p0, v1, 0x1

    .line 73
    .line 74
    invoke-static {p0}, La/x8x;->L(I)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {v2, p0, p1, v4, v5}, La/dj8;->n(IILa/fet;La/mm40;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_2
    move-object v0, v5

    .line 85
    check-cast v0, La/fro0;

    .line 86
    .line 87
    move-object v1, v4

    .line 88
    check-cast v1, La/mm40;

    .line 89
    .line 90
    move-object v4, p1

    .line 91
    check-cast v4, La/fet;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    iget v2, p0, La/i6n;->b:I

    .line 103
    .line 104
    iget v3, p0, La/i6n;->d:I

    .line 105
    .line 106
    invoke-static/range {v0 .. v5}, La/j6n;->q(La/fro0;La/mm40;IILa/fet;I)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
