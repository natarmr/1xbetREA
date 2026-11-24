.class public final synthetic La/zi6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/xcz;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;IB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/zi6;->a:B

    iput-object p1, p0, La/zi6;->b:La/mm40;

    iput-object p2, p0, La/zi6;->c:La/l7m0;

    iput-object p3, p0, La/zi6;->d:La/xcz;

    iput-object p4, p0, La/zi6;->e:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/zi6;->f:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/zi6;->g:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zi6;->a:B

    .line 2
    .line 3
    const v1, 0x30001

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v8, p1

    .line 10
    check-cast v8, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    iget-object v2, p0, La/zi6;->b:La/mm40;

    .line 22
    .line 23
    iget-object v3, p0, La/zi6;->c:La/l7m0;

    .line 24
    .line 25
    iget-object v4, p0, La/zi6;->d:La/xcz;

    .line 26
    .line 27
    iget-object v5, p0, La/zi6;->e:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-object v6, p0, La/zi6;->f:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-object v7, p0, La/zi6;->g:La/ugd;

    .line 32
    .line 33
    invoke-static/range {v2 .. v9}, La/x8f;->p(La/mm40;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    move-object v6, p1

    .line 40
    check-cast v6, La/fet;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, La/x8x;->L(I)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    iget-object v0, p0, La/zi6;->b:La/mm40;

    .line 52
    .line 53
    iget-object v1, p0, La/zi6;->c:La/l7m0;

    .line 54
    .line 55
    iget-object v2, p0, La/zi6;->d:La/xcz;

    .line 56
    .line 57
    iget-object v3, p0, La/zi6;->e:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    iget-object v4, p0, La/zi6;->f:Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    iget-object v5, p0, La/zi6;->g:La/ugd;

    .line 62
    .line 63
    invoke-static/range {v0 .. v7}, La/ju70;->f(La/mm40;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
