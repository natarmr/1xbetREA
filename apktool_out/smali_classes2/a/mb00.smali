.class public abstract La/mb00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qjt;


# static fields
.field public static final a:La/hos0;

.field public static final b:La/hos0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/hos0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, La/hos0;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/mb00;->a:La/hos0;

    .line 8
    .line 9
    new-instance v0, La/hos0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, -0x1

    .line 13
    invoke-direct {v0, v1, v2}, La/hos0;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/mb00;->b:La/hos0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/htw;Ljava/lang/String;La/j;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3, p2}, La/mb00;->b(La/j;Ljava/lang/String;)La/lb00;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/mb00;->a:La/hos0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, La/fdx;->a(La/htw;Ljava/lang/String;La/j;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, La/mb00;->d(La/htw;Ljava/lang/String;La/j;La/lb00;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public abstract b(La/j;Ljava/lang/String;)La/lb00;
.end method

.method public final c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x23

    .line 5
    .line 6
    invoke-static {p1, p0}, Lkotlin/text/StringsKt;->k0(Ljava/lang/CharSequence;C)Z

    .line 7
    .line 8
    .line 9
    return-object p1
.end method

.method public d(La/htw;Ljava/lang/String;La/j;La/lb00;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "href=\""

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p4, La/lb00;->b:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, La/mb00;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x22

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p4, La/lb00;->c:Ljava/lang/CharSequence;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "title=\""

    .line 35
    .line 36
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p0, 0x0

    .line 51
    :goto_0
    const/4 v1, 0x2

    .line 52
    new-array v1, v1, [Ljava/lang/CharSequence;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    aput-object v0, v1, v2

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    aput-object p0, v1, v0

    .line 59
    .line 60
    const-string p0, "a"

    .line 61
    .line 62
    invoke-virtual {p1, p3, p0, v1, v2}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 63
    .line 64
    .line 65
    sget-object p3, La/mb00;->b:La/hos0;

    .line 66
    .line 67
    iget-object p4, p4, La/lb00;->a:La/j;

    .line 68
    .line 69
    invoke-virtual {p3, p1, p2, p4}, La/fdx;->a(La/htw;Ljava/lang/String;La/j;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p0}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
