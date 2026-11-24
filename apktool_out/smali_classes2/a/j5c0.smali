.class public final synthetic La/j5c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/w5c0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/w5c0;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/j5c0;->a:B

    iput-object p1, p0, La/j5c0;->b:La/mm40;

    iput-object p2, p0, La/j5c0;->c:La/w5c0;

    iput-object p3, p0, La/j5c0;->d:Lkotlin/jvm/functions/Function0;

    iput p4, p0, La/j5c0;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j5c0;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/j5c0;->e:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, La/j5c0;->b:La/mm40;

    .line 22
    .line 23
    iget-object v1, p0, La/j5c0;->c:La/w5c0;

    .line 24
    .line 25
    iget-object p0, p0, La/j5c0;->d:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    invoke-static {v0, v1, p0, p1, p2}, La/m8x;->g(La/mm40;La/w5c0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget p2, p0, La/j5c0;->e:I

    .line 37
    .line 38
    or-int/lit8 p2, p2, 0x1

    .line 39
    .line 40
    invoke-static {p2}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iget-object v0, p0, La/j5c0;->b:La/mm40;

    .line 45
    .line 46
    iget-object v1, p0, La/j5c0;->c:La/w5c0;

    .line 47
    .line 48
    iget-object p0, p0, La/j5c0;->d:Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    invoke-static {v0, v1, p0, p1, p2}, La/m8x;->t(La/mm40;La/w5c0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
