.class public final La/tgu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nr70;


# direct methods
.method public constructor <init>(La/nr70;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/tgu;->a:La/nr70;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/p6d;
    .locals 6

    .line 1
    iget-object v0, p0, La/tgu;->a:La/nr70;

    .line 2
    .line 3
    iget-object v1, v0, La/nr70;->a:La/yuy;

    .line 4
    .line 5
    iget-object v2, v1, La/yuy;->b:La/p7m0;

    .line 6
    .line 7
    iget-object v1, v1, La/yuy;->b:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-object v2, v0, La/nr70;->b:La/huy;

    .line 19
    .line 20
    iget-object v2, v2, La/huy;->a:La/vwb0;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v4, "CURRENT_LANGUAGE_ID_KEY"

    .line 30
    .line 31
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    :cond_1
    new-instance v2, La/i89;

    .line 53
    .line 54
    const/16 v4, 0x16

    .line 55
    .line 56
    invoke-direct {v2, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, La/nr70;->a:La/yuy;

    .line 60
    .line 61
    iget-object v0, v0, La/yuy;->a:La/p7m0;

    .line 62
    .line 63
    new-instance v1, La/i89;

    .line 64
    .line 65
    invoke-direct {v1, v0, v4}, La/i89;-><init>(La/gmq;B)V

    .line 66
    .line 67
    .line 68
    new-instance v0, La/sgu;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-direct {v0, p0, v4, v3}, La/sgu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    new-instance p0, La/p6d;

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-direct {p0, v2, v1, v0, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method
