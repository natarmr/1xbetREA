.class public final synthetic La/iz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b07;


# direct methods
.method public synthetic constructor <init>(La/b07;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iz6;->a:B

    iput-object p1, p0, La/iz6;->b:La/b07;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/iz6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/iz6;->b:La/b07;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/b07;->w(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, La/oz6;->a:La/oz6;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/b07;->z(La/xz6;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, La/tz6;

    .line 23
    .line 24
    invoke-direct {p1, v1}, La/tz6;-><init>(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/b07;->z(La/xz6;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/tz6;

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/tz6;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, La/b07;->z(La/xz6;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, La/saj;->Y(Ljava/lang/Throwable;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, La/b07;->q:La/ax5;

    .line 51
    .line 52
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, La/ax5;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, La/b07;

    .line 58
    .line 59
    iget-object v0, v0, La/b07;->f:La/duj;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/nz6;

    .line 65
    .line 66
    const-string v0, ""

    .line 67
    .line 68
    invoke-direct {p1, v0}, La/nz6;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, La/b07;->z(La/xz6;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
