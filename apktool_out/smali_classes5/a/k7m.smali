.class public final synthetic La/k7m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:La/pu90;


# direct methods
.method public synthetic constructor <init>(La/pu90;ILa/pu90;ILa/pu90;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/k7m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k7m;->b:La/pu90;

    iput p2, p0, La/k7m;->d:I

    iput-object p3, p0, La/k7m;->c:La/pu90;

    iput p4, p0, La/k7m;->e:I

    iput-object p5, p0, La/k7m;->f:La/pu90;

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;IILa/pu90;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/k7m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k7m;->b:La/pu90;

    iput-object p2, p0, La/k7m;->c:La/pu90;

    iput p3, p0, La/k7m;->d:I

    iput p4, p0, La/k7m;->e:I

    iput-object p5, p0, La/k7m;->f:La/pu90;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/k7m;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/k7m;->f:La/pu90;

    .line 6
    .line 7
    iget v4, p0, La/k7m;->e:I

    .line 8
    .line 9
    iget v5, p0, La/k7m;->d:I

    .line 10
    .line 11
    iget-object v6, p0, La/k7m;->c:La/pu90;

    .line 12
    .line 13
    iget-object p0, p0, La/k7m;->b:La/pu90;

    .line 14
    .line 15
    check-cast p1, La/ou90;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 24
    .line 25
    .line 26
    div-int/lit8 p0, v5, 0x2

    .line 27
    .line 28
    div-int/lit8 v4, v4, 0x2

    .line 29
    .line 30
    sub-int/2addr p0, v4

    .line 31
    invoke-virtual {p1, v6, p0, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 32
    .line 33
    .line 34
    iget p0, v3, La/pu90;->a:I

    .line 35
    .line 36
    sub-int/2addr v5, p0

    .line 37
    invoke-virtual {p1, v3, v5, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0, v2, v5, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v6, v4, v5, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v3, v2, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
