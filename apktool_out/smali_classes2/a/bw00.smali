.class public final La/bw00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/logging/HttpLoggingInterceptor$Logger;


# instance fields
.field public final synthetic b:La/dw00;


# direct methods
.method public constructor <init>(La/dw00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bw00;->b:La/dw00;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/bw00;->b:La/dw00;

    .line 2
    .line 3
    iget-object v0, p0, La/dw00;->i:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    iget-boolean v0, p0, La/dw00;->a:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object v0, La/dw00;->k:[La/iiy;

    .line 35
    .line 36
    iget-object v0, p0, La/dw00;->f:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lkotlin/text/Regex;

    .line 43
    .line 44
    invoke-static {v0, p1}, Lkotlin/text/Regex;->d(Lkotlin/text/Regex;Ljava/lang/CharSequence;)La/tjt;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, La/gvy;->r:La/gvy;

    .line 49
    .line 50
    invoke-static {v0, v1}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/pls0;

    .line 55
    .line 56
    invoke-direct {v1, v0}, La/pls0;-><init>(La/qls0;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/dw00;->e:La/n0o0;

    .line 60
    .line 61
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/rnh0;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, La/rnh0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v0, p0, La/dw00;->g:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lkotlin/text/Regex;

    .line 78
    .line 79
    new-instance v2, La/fne;

    .line 80
    .line 81
    const/4 v3, 0x2

    .line 82
    invoke-direct {v2, p0, v1, v3}, La/fne;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, v2}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :cond_1
    iget-object p0, p0, La/dw00;->c:La/gsj;

    .line 90
    .line 91
    iget-object v0, p0, La/gsj;->a:La/n0o0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/vv00;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-virtual {p0, v0, p1, v1}, La/gsj;->b(La/vv00;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
