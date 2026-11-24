.class public final La/t6w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/zix;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/zix;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t6w0;->a:B

    iput-object p2, p0, La/t6w0;->b:La/zix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t6w0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/t6w0;->b:La/zix;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/zix;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/i6a;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, La/i6a;->getServiceProvider()La/kii0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object p0, p0, La/zix;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lorg/xplatform/secret/impl/SecurityImpl;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    iget-object p0, p0, La/zix;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/xjh0;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, La/xjh0;->c()La/akh0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    iget-object p0, p0, La/zix;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, La/xjh0;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, La/xjh0;->f()La/wsb0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_3
    iget-object p0, p0, La/zix;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/xjh0;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, La/xjh0;->g()La/vby;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
