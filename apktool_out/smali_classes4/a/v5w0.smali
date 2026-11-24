.class public final synthetic La/v5w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kii0;


# direct methods
.method public synthetic constructor <init>(La/kii0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v5w0;->a:B

    iput-object p1, p0, La/v5w0;->b:La/kii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v5w0;->a:B

    .line 2
    .line 3
    const-class v1, La/w4w0;

    .line 4
    .line 5
    iget-object p0, p0, La/v5w0;->b:La/kii0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-class v0, La/uyk;

    .line 11
    .line 12
    sget-object v1, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast p0, La/lii0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/lii0;->a(La/sgy;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/uyk;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast p0, La/lii0;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/lii0;->a(La/sgy;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/w4w0;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    sget-object v0, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast p0, La/lii0;

    .line 49
    .line 50
    iget-object p0, p0, La/lii0;->a:La/gii0;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/w4w0;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
