.class public final synthetic La/y2g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x3m;


# direct methods
.method public synthetic constructor <init>(La/x3m;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y2g;->a:B

    iput-object p1, p0, La/y2g;->b:La/x3m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/y2g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y2g;->b:La/x3m;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/x3m;->c()La/y3m;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget-object v0, p0, La/x3m;->d:La/rv2;

    .line 14
    .line 15
    iget-object v0, v0, La/rv2;->f:La/agk0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/agk0;->l()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, La/x3m;->c()La/y3m;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, La/x3m;->d:La/rv2;

    .line 26
    .line 27
    iget-object v2, v2, La/rv2;->e:La/zbk;

    .line 28
    .line 29
    invoke-virtual {v2}, La/zbk;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/y3m;

    .line 34
    .line 35
    if-ne v1, v2, :cond_0

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    new-instance v1, La/f3g;

    .line 44
    .line 45
    invoke-virtual {p0}, La/x3m;->c()La/y3m;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object p0, p0, La/x3m;->c:La/agk0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/agk0;->l()F

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-direct {v1, v2, v0, p0}, La/f3g;-><init>(La/y3m;FF)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v1, 0x0

    .line 60
    :goto_0
    return-object v1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
