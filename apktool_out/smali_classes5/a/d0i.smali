.class public final synthetic La/d0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:F

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(FIILa/a4x;)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    iput-byte p3, p0, La/d0i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/d0i;->b:Ljava/lang/Object;

    iput-byte p2, p0, La/d0i;->d:B

    iput p1, p0, La/d0i;->c:F

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;FIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/d0i;->a:B

    iput-object p1, p0, La/d0i;->b:Ljava/lang/Object;

    iput p2, p0, La/d0i;->c:F

    iput-byte p3, p0, La/d0i;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;FII)V
    .locals 0

    .line 3
    const/4 p3, 0x1

    iput-byte p3, p0, La/d0i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d0i;->b:Ljava/lang/Object;

    iput p2, p0, La/d0i;->c:F

    iput-byte p4, p0, La/d0i;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/d0i;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/d0i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/a4x;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    invoke-static {p2}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iget-byte v1, p0, La/d0i;->d:B

    .line 23
    .line 24
    iget p0, p0, La/d0i;->c:F

    .line 25
    .line 26
    invoke-static {v0, v1, p0, p1, p2}, La/gfx;->t(La/a4x;IFLa/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    iget-object v0, p0, La/d0i;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/mm40;

    .line 35
    .line 36
    check-cast p1, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-byte p2, p0, La/d0i;->d:B

    .line 44
    .line 45
    or-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    invoke-static {p2}, La/x8x;->L(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget p0, p0, La/d0i;->c:F

    .line 52
    .line 53
    invoke-static {v0, p0, p1, p2}, La/ntr;->R(La/mm40;FLa/fet;I)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    iget-object v0, p0, La/d0i;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/mm40;

    .line 62
    .line 63
    check-cast p1, La/fet;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-byte p2, p0, La/d0i;->d:B

    .line 71
    .line 72
    or-int/lit8 p2, p2, 0x1

    .line 73
    .line 74
    invoke-static {p2}, La/x8x;->L(I)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget p0, p0, La/d0i;->c:F

    .line 79
    .line 80
    invoke-static {v0, p0, p1, p2}, La/gfx;->p(La/mm40;FLa/fet;I)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_2
    iget-object v0, p0, La/d0i;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/mm40;

    .line 89
    .line 90
    check-cast p1, La/fet;

    .line 91
    .line 92
    check-cast p2, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const/4 p2, 0x1

    .line 98
    invoke-static {p2}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iget v1, p0, La/d0i;->c:F

    .line 103
    .line 104
    iget-byte p0, p0, La/d0i;->d:B

    .line 105
    .line 106
    invoke-static {v0, v1, p1, p2, p0}, La/jiq0;->Z(La/mm40;FLa/fet;II)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_3
    iget-object v0, p0, La/d0i;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/mm40;

    .line 115
    .line 116
    check-cast p1, La/fet;

    .line 117
    .line 118
    check-cast p2, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-byte p2, p0, La/d0i;->d:B

    .line 124
    .line 125
    or-int/lit8 p2, p2, 0x1

    .line 126
    .line 127
    invoke-static {p2}, La/x8x;->L(I)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    iget p0, p0, La/d0i;->c:F

    .line 132
    .line 133
    invoke-static {v0, p0, p1, p2}, La/ro4;->w(La/mm40;FLa/fet;I)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
