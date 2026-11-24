.class public final synthetic La/vil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(La/mm40;FFIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/vil;->a:B

    iput-object p1, p0, La/vil;->b:La/mm40;

    iput p2, p0, La/vil;->c:F

    iput p3, p0, La/vil;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vil;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, La/x8x;->L(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, La/vil;->b:La/mm40;

    .line 19
    .line 20
    iget v1, p0, La/vil;->c:F

    .line 21
    .line 22
    iget p0, p0, La/vil;->d:F

    .line 23
    .line 24
    invoke-static {v0, v1, p0, p1, p2}, La/x8x;->c(La/mm40;FFLa/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    const/4 p2, 0x1

    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, La/vil;->b:La/mm40;

    .line 36
    .line 37
    iget v1, p0, La/vil;->c:F

    .line 38
    .line 39
    iget p0, p0, La/vil;->d:F

    .line 40
    .line 41
    invoke-static {v0, v1, p0, p1, p2}, La/d9x;->e(La/mm40;FFLa/fet;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    const/4 p2, 0x1

    .line 48
    invoke-static {p2}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iget-object v0, p0, La/vil;->b:La/mm40;

    .line 53
    .line 54
    iget v1, p0, La/vil;->c:F

    .line 55
    .line 56
    iget p0, p0, La/vil;->d:F

    .line 57
    .line 58
    invoke-static {v0, v1, p0, p1, p2}, La/c9x;->b(La/mm40;FFLa/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_2
    const/4 p2, 0x1

    .line 65
    invoke-static {p2}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object v0, p0, La/vil;->b:La/mm40;

    .line 70
    .line 71
    iget v1, p0, La/vil;->c:F

    .line 72
    .line 73
    iget p0, p0, La/vil;->d:F

    .line 74
    .line 75
    invoke-static {v0, v1, p0, p1, p2}, La/e9x;->c(La/mm40;FFLa/fet;I)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_3
    const/4 p2, 0x1

    .line 82
    invoke-static {p2}, La/x8x;->L(I)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iget-object v0, p0, La/vil;->b:La/mm40;

    .line 87
    .line 88
    iget v1, p0, La/vil;->c:F

    .line 89
    .line 90
    iget p0, p0, La/vil;->d:F

    .line 91
    .line 92
    invoke-static {v0, v1, p0, p1, p2}, La/jcb;->t(La/mm40;FFLa/fet;I)V

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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
