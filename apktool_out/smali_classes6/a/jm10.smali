.class public final synthetic La/jm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:La/pu90;

.field public final synthetic e:I

.field public final synthetic f:La/pu90;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/pu90;ILa/pu90;La/pu90;La/pu90;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/jm10;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jm10;->b:La/pu90;

    iput p2, p0, La/jm10;->e:I

    iput-object p3, p0, La/jm10;->c:La/pu90;

    iput-object p4, p0, La/jm10;->d:La/pu90;

    iput-object p5, p0, La/jm10;->f:La/pu90;

    iput p6, p0, La/jm10;->g:I

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;La/pu90;ILa/pu90;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/jm10;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jm10;->b:La/pu90;

    iput-object p2, p0, La/jm10;->c:La/pu90;

    iput-object p3, p0, La/jm10;->d:La/pu90;

    iput p4, p0, La/jm10;->e:I

    iput-object p5, p0, La/jm10;->f:La/pu90;

    iput p6, p0, La/jm10;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/jm10;->a:B

    .line 2
    .line 3
    iget v1, p0, La/jm10;->g:I

    .line 4
    .line 5
    iget-object v2, p0, La/jm10;->f:La/pu90;

    .line 6
    .line 7
    iget v3, p0, La/jm10;->e:I

    .line 8
    .line 9
    iget-object v4, p0, La/jm10;->d:La/pu90;

    .line 10
    .line 11
    iget-object v5, p0, La/jm10;->c:La/pu90;

    .line 12
    .line 13
    iget-object p0, p0, La/jm10;->b:La/pu90;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    check-cast p1, La/ou90;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, p0, v6, v6, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz v5, :cond_2

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    iget p0, p0, La/pu90;->b:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move p0, v6

    .line 38
    :goto_0
    invoke-virtual {p1, v5, v6, p0, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1, v4, v6, v3, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 42
    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    iget p0, v2, La/pu90;->b:I

    .line 47
    .line 48
    sub-int/2addr v1, p0

    .line 49
    invoke-virtual {p1, v2, v6, v1, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 50
    .line 51
    .line 52
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
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
    invoke-virtual {p1, p0, v6, v0, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v5, v6, v3, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 66
    .line 67
    .line 68
    iget p0, v5, La/pu90;->b:I

    .line 69
    .line 70
    add-int/2addr v3, p0

    .line 71
    invoke-virtual {p1, v4, v6, v3, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 72
    .line 73
    .line 74
    iget p0, v2, La/pu90;->b:I

    .line 75
    .line 76
    sub-int/2addr v1, p0

    .line 77
    invoke-virtual {p1, v2, v6, v1, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
