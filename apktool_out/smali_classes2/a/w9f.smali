.class public final synthetic La/w9f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:La/n25;


# direct methods
.method public synthetic constructor <init>(La/n25;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w9f;->a:La/n25;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/w8f;

    .line 3
    .line 4
    iget-object p0, p0, La/w9f;->a:La/n25;

    .line 5
    .line 6
    invoke-virtual {p0}, La/n25;->a()La/m25;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, La/n25;->c:La/h9f;

    .line 11
    .line 12
    invoke-virtual {p0}, La/h9f;->a()La/o25;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    check-cast p0, La/p25;

    .line 17
    .line 18
    iget-object p0, p0, La/p25;->a:La/f9f;

    .line 19
    .line 20
    check-cast p0, La/q25;

    .line 21
    .line 22
    iget-object v1, p0, La/q25;->a:Ljava/util/List;

    .line 23
    .line 24
    iget-object v2, p0, La/q25;->b:La/b9f;

    .line 25
    .line 26
    iget-object v3, p0, La/q25;->c:La/r8f;

    .line 27
    .line 28
    iget-object v5, p0, La/q25;->e:La/t25;

    .line 29
    .line 30
    iget-object v6, p0, La/q25;->f:Ljava/util/List;

    .line 31
    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    const-string p1, " binaries"

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_0
    const-string p1, "Missing required properties:"

    .line 47
    .line 48
    invoke-static {p1, p0}, La/vqd;->o(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_1
    new-instance v0, La/q25;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v6}, La/q25;-><init>(Ljava/util/List;La/b9f;La/r8f;La/w8f;La/t25;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, v7, La/o25;->a:La/f9f;

    .line 63
    .line 64
    invoke-virtual {v7}, La/o25;->a()La/p25;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, p1, La/m25;->c:La/h9f;

    .line 69
    .line 70
    invoke-virtual {p1}, La/m25;->a()La/n25;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method
