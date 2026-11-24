.class public final La/f9y;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/h9y;


# direct methods
.method public synthetic constructor <init>(La/h9y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f9y;->a:B

    iput-object p1, p0, La/f9y;->b:La/h9y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/f9y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f9y;->b:La/h9y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, La/ev9;

    .line 15
    .line 16
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p0}, La/fre0;->P(La/dre0;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, v1, p0}, La/ev9;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, La/fv9;

    .line 29
    .line 30
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, La/fv9;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-object v0

    .line 38
    :pswitch_0
    invoke-static {p0}, La/ufx;->x(La/i9y;)La/lc00;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    iget-object v0, p0, La/e9y;->c:La/ihy;

    .line 44
    .line 45
    invoke-interface {v0}, La/elc;->j()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0}, La/h9y;->B()Ljava/lang/reflect/Constructor;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p0}, La/qx3;->r([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, [Ljava/lang/reflect/TypeVariable;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
