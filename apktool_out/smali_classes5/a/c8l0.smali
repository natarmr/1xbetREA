.class public final synthetic La/c8l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:S

.field public final synthetic f:La/f3n;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/f3n;FLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/c8l0;->a:B

    iput-object p1, p0, La/c8l0;->b:La/mm40;

    iput-object p2, p0, La/c8l0;->f:La/f3n;

    iput p3, p0, La/c8l0;->c:F

    iput-object p4, p0, La/c8l0;->d:Lkotlin/jvm/functions/Function1;

    iput-short p5, p0, La/c8l0;->e:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/c8l0;->a:B

    .line 2
    .line 3
    iget-short v1, p0, La/c8l0;->e:S

    .line 4
    .line 5
    iget-object v2, p0, La/c8l0;->f:La/f3n;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v4, v2

    .line 11
    check-cast v4, La/z2n;

    .line 12
    .line 13
    move-object v7, p1

    .line 14
    check-cast v7, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p1, v1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    iget-object v3, p0, La/c8l0;->b:La/mm40;

    .line 28
    .line 29
    iget v5, p0, La/c8l0;->c:F

    .line 30
    .line 31
    iget-object v6, p0, La/c8l0;->d:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    invoke-static/range {v3 .. v8}, La/ntr;->v(La/mm40;La/z2n;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast v2, La/w2n;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, La/fet;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    or-int/lit8 p1, v1, 0x1

    .line 50
    .line 51
    invoke-static {p1}, La/x8x;->L(I)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    iget-object v0, p0, La/c8l0;->b:La/mm40;

    .line 56
    .line 57
    move-object v1, v2

    .line 58
    iget v2, p0, La/c8l0;->c:F

    .line 59
    .line 60
    iget-object v3, p0, La/c8l0;->d:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-static/range {v0 .. v5}, La/gfx;->c(La/mm40;La/w2n;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
