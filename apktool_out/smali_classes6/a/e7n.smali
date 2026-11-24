.class public final synthetic La/e7n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:La/kly;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:B

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;ILa/kly;Lkotlin/jvm/functions/Function1;IIB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/e7n;->a:B

    iput-object p1, p0, La/e7n;->b:La/mm40;

    iput-object p2, p0, La/e7n;->h:Ljava/lang/Object;

    iput p3, p0, La/e7n;->c:I

    iput-object p4, p0, La/e7n;->d:La/kly;

    iput-object p5, p0, La/e7n;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, La/e7n;->f:I

    iput-byte p7, p0, La/e7n;->g:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/e7n;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/e7n;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/s6q0;

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
    iget p1, p0, La/e7n;->f:I

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
    iget-object v1, p0, La/e7n;->b:La/mm40;

    .line 28
    .line 29
    iget v3, p0, La/e7n;->c:I

    .line 30
    .line 31
    iget-object v4, p0, La/e7n;->d:La/kly;

    .line 32
    .line 33
    iget-object v5, p0, La/e7n;->e:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    iget-byte v8, p0, La/e7n;->g:B

    .line 36
    .line 37
    invoke-static/range {v1 .. v8}, La/jwb;->o(La/mm40;La/s6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    iget-object v0, p0, La/e7n;->h:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, La/c6q0;

    .line 47
    .line 48
    move-object v6, p1

    .line 49
    check-cast v6, La/fet;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget p1, p0, La/e7n;->f:I

    .line 57
    .line 58
    or-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    invoke-static {p1}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    iget-object v1, p0, La/e7n;->b:La/mm40;

    .line 65
    .line 66
    iget v3, p0, La/e7n;->c:I

    .line 67
    .line 68
    iget-object v4, p0, La/e7n;->d:La/kly;

    .line 69
    .line 70
    iget-object v5, p0, La/e7n;->e:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    iget-byte v8, p0, La/e7n;->g:B

    .line 73
    .line 74
    invoke-static/range {v1 .. v8}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
