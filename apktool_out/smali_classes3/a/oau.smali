.class public final synthetic La/oau;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dyv0;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/dyv0;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oau;->a:B

    iput-object p1, p0, La/oau;->b:La/dyv0;

    iput-boolean p2, p0, La/oau;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/oau;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-boolean v3, p0, La/oau;->c:Z

    .line 6
    .line 7
    iget-object p0, p0, La/oau;->b:La/dyv0;

    .line 8
    .line 9
    check-cast p1, La/iz30;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v0, La/iz30;->g:La/iz30;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, La/dyv0;->c:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    :goto_0
    move v1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v0, La/iz30;->h:La/iz30;

    .line 28
    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object v0, La/iz30;->i:La/iz30;

    .line 35
    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    iget-boolean p0, p0, La/dyv0;->d:Z

    .line 39
    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, La/iz30;->g:La/iz30;

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    iget-boolean v0, p0, La/dyv0;->c:Z

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    :goto_2
    move v1, v2

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    sget-object v0, La/iz30;->h:La/iz30;

    .line 62
    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    sget-object v0, La/iz30;->i:La/iz30;

    .line 69
    .line 70
    if-ne p1, v0, :cond_5

    .line 71
    .line 72
    iget-boolean p0, p0, La/dyv0;->d:Z

    .line 73
    .line 74
    if-nez p0, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
