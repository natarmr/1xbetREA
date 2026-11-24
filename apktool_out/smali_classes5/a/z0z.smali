.class public final La/z0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/agk0;

.field public final synthetic c:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/agk0;La/cgk0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z0z;->a:B

    iput-object p1, p0, La/z0z;->b:La/agk0;

    iput-object p2, p0, La/z0z;->c:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/z0z;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/z0z;->c:La/cgk0;

    .line 6
    .line 7
    iget-object p0, p0, La/z0z;->b:La/agk0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/agk0;->l()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    cmpg-float p0, p0, v0

    .line 22
    .line 23
    if-gez p0, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p0}, La/agk0;->l()F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {v3}, La/cgk0;->l()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-float v0, v0

    .line 40
    cmpg-float p0, p0, v0

    .line 41
    .line 42
    if-gez p0, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
