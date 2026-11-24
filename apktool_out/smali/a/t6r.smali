.class public final synthetic La/t6r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fuo;


# direct methods
.method public synthetic constructor <init>(La/fuo;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t6r;->a:B

    iput-object p1, p0, La/t6r;->b:La/fuo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/t6r;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/t6r;->b:La/fuo;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/iv40;

    .line 10
    .line 11
    check-cast p1, La/lbs0;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p0, p0, La/iv40;->b:I

    .line 17
    .line 18
    and-int/lit16 p0, p0, 0x400

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p1, La/lbs0;->g:Landroidx/media3/common/b;

    .line 23
    .line 24
    invoke-static {p0}, La/jyc;->e(Landroidx/media3/common/b;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, p1

    .line 32
    :goto_0
    return-object v1

    .line 33
    :pswitch_0
    check-cast p0, La/x6r;

    .line 34
    .line 35
    check-cast p1, La/lbs0;

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget p0, p0, La/x6r;->b:I

    .line 41
    .line 42
    and-int/lit16 p0, p0, 0x800

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    iget-object p0, p1, La/lbs0;->g:Landroidx/media3/common/b;

    .line 47
    .line 48
    invoke-static {p0}, La/jyc;->e(Landroidx/media3/common/b;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v1, p1

    .line 56
    :goto_1
    return-object v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
