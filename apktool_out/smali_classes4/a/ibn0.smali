.class public final synthetic La/ibn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/a4x;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/ibn0;->a:B

    iput-object p1, p0, La/ibn0;->b:La/l7m0;

    iput-object p2, p0, La/ibn0;->c:La/a4x;

    iput-boolean p3, p0, La/ibn0;->d:Z

    iput-boolean p4, p0, La/ibn0;->e:Z

    iput-object p5, p0, La/ibn0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/ibn0;->g:Lkotlin/jvm/functions/Function1;

    iput p7, p0, La/ibn0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ibn0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/ibn0;->h:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v1, p0, La/ibn0;->b:La/l7m0;

    .line 23
    .line 24
    iget-object v2, p0, La/ibn0;->c:La/a4x;

    .line 25
    .line 26
    iget-boolean v3, p0, La/ibn0;->d:Z

    .line 27
    .line 28
    iget-boolean v4, p0, La/ibn0;->e:Z

    .line 29
    .line 30
    iget-object v5, p0, La/ibn0;->f:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    iget-object v6, p0, La/ibn0;->g:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-static/range {v1 .. v8}, La/rsr0;->x(La/l7m0;La/a4x;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    move-object v6, p1

    .line 41
    check-cast v6, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p1, p0, La/ibn0;->h:I

    .line 49
    .line 50
    or-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object v0, p0, La/ibn0;->b:La/l7m0;

    .line 57
    .line 58
    iget-object v1, p0, La/ibn0;->c:La/a4x;

    .line 59
    .line 60
    iget-boolean v2, p0, La/ibn0;->d:Z

    .line 61
    .line 62
    iget-boolean v3, p0, La/ibn0;->e:Z

    .line 63
    .line 64
    iget-object v4, p0, La/ibn0;->f:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    iget-object v5, p0, La/ibn0;->g:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-static/range {v0 .. v7}, La/ohq0;->E(La/l7m0;La/a4x;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
