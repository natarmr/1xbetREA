.class public final synthetic La/s7m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/r7m;

.field public final synthetic d:F

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:S

.field public final synthetic h:La/b8m;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/b8m;La/r7m;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/s7m;->a:B

    iput-object p1, p0, La/s7m;->b:La/mm40;

    iput-object p2, p0, La/s7m;->h:La/b8m;

    iput-object p3, p0, La/s7m;->c:La/r7m;

    iput p4, p0, La/s7m;->d:F

    iput-object p5, p0, La/s7m;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/s7m;->f:Lkotlin/jvm/functions/Function0;

    iput-short p7, p0, La/s7m;->g:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/s7m;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/s7m;->h:La/b8m;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/a8m;

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    check-cast v7, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-short p1, p0, La/s7m;->g:S

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    iget-object v1, p0, La/s7m;->b:La/mm40;

    .line 28
    .line 29
    iget-object v3, p0, La/s7m;->c:La/r7m;

    .line 30
    .line 31
    iget v4, p0, La/s7m;->d:F

    .line 32
    .line 33
    iget-object v5, p0, La/s7m;->e:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    iget-object v6, p0, La/s7m;->f:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-static/range {v1 .. v8}, La/dyb;->q(La/mm40;La/a8m;La/r7m;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    iget-object v0, p0, La/s7m;->h:La/b8m;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, La/x7m;

    .line 47
    .line 48
    move-object v7, p1

    .line 49
    check-cast v7, La/fet;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-short p1, p0, La/s7m;->g:S

    .line 57
    .line 58
    or-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    invoke-static {p1}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    iget-object v1, p0, La/s7m;->b:La/mm40;

    .line 65
    .line 66
    iget-object v3, p0, La/s7m;->c:La/r7m;

    .line 67
    .line 68
    iget v4, p0, La/s7m;->d:F

    .line 69
    .line 70
    iget-object v5, p0, La/s7m;->e:Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    iget-object v6, p0, La/s7m;->f:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    invoke-static/range {v1 .. v8}, La/fxb;->m(La/mm40;La/x7m;La/r7m;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

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
