.class public final synthetic La/pkp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/fqj0;


# direct methods
.method public synthetic constructor <init>(ILa/fqj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/pkp0;->a:I

    iput-object p2, p0, La/pkp0;->b:La/fqj0;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    check-cast p3, La/fet;

    .line 9
    .line 10
    check-cast p4, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit16 p1, p2, 0x81

    .line 20
    .line 21
    const/16 p4, 0x80

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-eq p1, p4, :cond_0

    .line 26
    .line 27
    move p1, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v0

    .line 30
    :goto_0
    and-int/2addr p2, v1

    .line 31
    invoke-virtual {p3, p2, p1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    move p1, v0

    .line 38
    :goto_1
    iget p2, p0, La/pkp0;->a:I

    .line 39
    .line 40
    if-ge p1, p2, :cond_2

    .line 41
    .line 42
    iget-object p2, p0, La/pkp0;->b:La/fqj0;

    .line 43
    .line 44
    invoke-static {p2, p3, v0}, La/k7n0;->e(La/fqj0;La/fet;I)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p3}, La/fet;->X()V

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0
.end method
