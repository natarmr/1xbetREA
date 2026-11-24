.class public final synthetic La/sl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/on0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/on0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sl0;->a:B

    iput-object p1, p0, La/sl0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/sl0;->c:La/on0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/sl0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/sl0;->c:La/on0;

    .line 4
    .line 5
    iget-object p0, p0, La/sl0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    check-cast p1, La/st0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/hl0;

    .line 16
    .line 17
    iget-wide v2, p1, La/st0;->a:J

    .line 18
    .line 19
    check-cast v1, La/nn0;

    .line 20
    .line 21
    iget-object p1, v1, La/nn0;->a:La/yl0;

    .line 22
    .line 23
    iget-object p1, p1, La/yl0;->b:La/j8b;

    .line 24
    .line 25
    iget-wide v4, p1, La/j8b;->a:J

    .line 26
    .line 27
    invoke-direct {v0, v2, v3, v4, v5}, La/hl0;-><init>(JJ)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v2, La/gl0;

    .line 40
    .line 41
    iget-wide v3, p1, La/st0;->a:J

    .line 42
    .line 43
    check-cast v1, La/nn0;

    .line 44
    .line 45
    iget-object v0, v1, La/nn0;->a:La/yl0;

    .line 46
    .line 47
    iget-object v0, v0, La/yl0;->b:La/j8b;

    .line 48
    .line 49
    iget-wide v6, v0, La/j8b;->a:J

    .line 50
    .line 51
    iget-object p1, p1, La/st0;->d:La/mtr;

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    iget-boolean p1, p1, La/mtr;->b:Z

    .line 56
    .line 57
    :goto_0
    move v5, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 p1, 0x0

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    invoke-direct/range {v2 .. v7}, La/gl0;-><init>(JZJ)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
