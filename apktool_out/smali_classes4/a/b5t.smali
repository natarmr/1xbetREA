.class public final synthetic La/b5t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/g9b0;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(BLa/cp;La/g9b0;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/b5t;->a:B

    iput-object p2, p0, La/b5t;->b:La/cp;

    iput-object p3, p0, La/b5t;->c:La/g9b0;

    iput-object p4, p0, La/b5t;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/b5t;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/b5t;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/b5t;->c:La/g9b0;

    .line 6
    .line 7
    iget-object p0, p0, La/b5t;->b:La/cp;

    .line 8
    .line 9
    check-cast p1, La/u4s;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    check-cast p3, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/pv60;

    .line 30
    .line 31
    iget-object p1, p1, La/pv60;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, La/mo60;

    .line 38
    .line 39
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/pv60;

    .line 44
    .line 45
    iget-object p0, p0, La/pv60;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v1, p1, p0, p3}, La/g9b0;->D(Ljava/lang/String;La/mo60;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/qv60;

    .line 58
    .line 59
    iget-object p1, p1, La/qv60;->e:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, La/mo60;

    .line 66
    .line 67
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/qv60;

    .line 72
    .line 73
    iget-object p0, p0, La/qv60;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v2, v1, p1, p0, p3}, La/g9b0;->D(Ljava/lang/String;La/mo60;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
