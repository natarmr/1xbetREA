.class public final synthetic La/d4i;
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


# direct methods
.method public synthetic constructor <init>(ILa/pu90;La/pu90;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/d4i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/d4i;->d:I

    iput-object p2, p0, La/d4i;->b:La/pu90;

    iput-object p3, p0, La/d4i;->c:La/pu90;

    iput p4, p0, La/d4i;->e:I

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;ILa/pu90;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/d4i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d4i;->b:La/pu90;

    iput p2, p0, La/d4i;->d:I

    iput-object p3, p0, La/d4i;->c:La/pu90;

    iput p4, p0, La/d4i;->e:I

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;II)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/d4i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/d4i;->b:La/pu90;

    iput-object p2, p0, La/d4i;->c:La/pu90;

    iput p3, p0, La/d4i;->d:I

    iput p4, p0, La/d4i;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/d4i;->a:B

    .line 2
    .line 3
    iget v1, p0, La/d4i;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/d4i;->c:La/pu90;

    .line 6
    .line 7
    iget v3, p0, La/d4i;->d:I

    .line 8
    .line 9
    iget-object p0, p0, La/d4i;->b:La/pu90;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    check-cast p1, La/ou90;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    iget v0, p0, La/pu90;->b:I

    .line 24
    .line 25
    sub-int/2addr v3, v0

    .line 26
    div-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    if-gez v3, :cond_0

    .line 29
    .line 30
    move v3, v4

    .line 31
    :cond_0
    invoke-virtual {p1, p0, v4, v3, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 32
    .line 33
    .line 34
    :cond_1
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1, v2, v1, v4, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 37
    .line 38
    .line 39
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0, v4, v4, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 46
    .line 47
    .line 48
    add-int/2addr v3, v1

    .line 49
    invoke-virtual {p1, v2, v3, v4, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget v0, p0, La/pu90;->b:I

    .line 59
    .line 60
    sub-int v0, v3, v0

    .line 61
    .line 62
    div-int/lit8 v0, v0, 0x2

    .line 63
    .line 64
    iget v6, v2, La/pu90;->b:I

    .line 65
    .line 66
    sub-int/2addr v3, v6

    .line 67
    div-int/lit8 v3, v3, 0x2

    .line 68
    .line 69
    invoke-virtual {p1, p0, v4, v0, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 70
    .line 71
    .line 72
    iget p0, v2, La/pu90;->a:I

    .line 73
    .line 74
    sub-int/2addr v1, p0

    .line 75
    invoke-virtual {p1, v2, v1, v3, v5}, La/ou90;->m(La/pu90;IIF)V

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
