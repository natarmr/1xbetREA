.class public final La/x3l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngk0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ngk0;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x3l0;->a:B

    iput-object p1, p0, La/x3l0;->b:La/ngk0;

    iput-object p2, p0, La/x3l0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x3l0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/lwk;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p1, La/w3l0;

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    iget-object v1, p0, La/x3l0;->b:La/ngk0;

    .line 15
    .line 16
    iget-object p0, p0, La/x3l0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {p1, v1, p0, v0}, La/w3l0;-><init>(La/ngk0;Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    check-cast p1, La/lwk;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p1, La/w3l0;

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    iget-object v1, p0, La/x3l0;->b:La/ngk0;

    .line 31
    .line 32
    iget-object p0, p0, La/x3l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p1, v1, p0, v0}, La/w3l0;-><init>(La/ngk0;Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, La/lwk;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance p1, La/w3l0;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iget-object v1, p0, La/x3l0;->b:La/ngk0;

    .line 47
    .line 48
    iget-object p0, p0, La/x3l0;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p1, v1, p0, v0}, La/w3l0;-><init>(La/ngk0;Ljava/lang/String;B)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_2
    check-cast p1, La/lwk;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance p1, La/w3l0;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iget-object v1, p0, La/x3l0;->b:La/ngk0;

    .line 63
    .line 64
    iget-object p0, p0, La/x3l0;->c:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {p1, v1, p0, v0}, La/w3l0;-><init>(La/ngk0;Ljava/lang/String;B)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
