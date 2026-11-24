.class public final synthetic La/wmr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/cgk0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wmr;->a:B

    iput-object p1, p0, La/wmr;->b:La/a4x;

    iput-object p2, p0, La/wmr;->c:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wmr;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wmr;->c:La/cgk0;

    .line 4
    .line 5
    iget-object p0, p0, La/wmr;->b:La/a4x;

    .line 6
    .line 7
    check-cast p1, La/iz3;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ge p1, p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/lit8 p0, p0, 0x1

    .line 30
    .line 31
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-ge p1, p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    add-int/lit8 p0, p0, 0x1

    .line 52
    .line 53
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-ge p1, p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    add-int/lit8 p0, p0, 0x1

    .line 74
    .line 75
    invoke-virtual {v1, p0}, La/cgk0;->m(I)V

    .line 76
    .line 77
    .line 78
    :cond_2
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
