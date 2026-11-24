.class public final synthetic La/xkz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:La/clz;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/clz;Lkotlin/jvm/functions/Function1;IIB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/xkz;->a:B

    iput-object p1, p0, La/xkz;->b:Ljava/lang/Object;

    iput-object p2, p0, La/xkz;->c:Ljava/lang/Object;

    iput-object p3, p0, La/xkz;->d:La/clz;

    iput-object p4, p0, La/xkz;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/xkz;->f:I

    iput-byte p6, p0, La/xkz;->g:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/xkz;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/xkz;->f:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v1, p0, La/xkz;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v2, p0, La/xkz;->c:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p0, La/xkz;->d:La/clz;

    .line 27
    .line 28
    iget-object v4, p0, La/xkz;->e:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iget-byte v7, p0, La/xkz;->g:B

    .line 31
    .line 32
    invoke-static/range {v1 .. v7}, La/s0x;->e(Ljava/lang/Object;Ljava/lang/Object;La/clz;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    move-object v4, p1

    .line 39
    check-cast v4, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget p1, p0, La/xkz;->f:I

    .line 47
    .line 48
    or-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-static {p1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-object v0, p0, La/xkz;->b:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v1, p0, La/xkz;->c:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v2, p0, La/xkz;->d:La/clz;

    .line 59
    .line 60
    iget-object v3, p0, La/xkz;->e:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    iget-byte v6, p0, La/xkz;->g:B

    .line 63
    .line 64
    invoke-static/range {v0 .. v6}, La/s0x;->h(Ljava/lang/Object;Ljava/lang/Object;La/clz;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
