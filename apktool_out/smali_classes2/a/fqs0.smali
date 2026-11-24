.class public final La/fqs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/sgi0;


# direct methods
.method public constructor <init>(IILa/sgi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/fqs0;->a:I

    .line 5
    .line 6
    iput p2, p0, La/fqs0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/fqs0;->c:La/sgi0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/fqs0;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/fqs0;->a:I

    .line 5
    .line 6
    iget v1, p0, La/fqs0;->a:I

    .line 7
    .line 8
    if-eq v1, v0, :cond_0

    .line 9
    .line 10
    sub-int/2addr v1, v0

    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {p0}, La/fqs0;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, La/fqs0;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v0, v1, :cond_5

    .line 21
    .line 22
    iget-object v0, p0, La/fqs0;->c:La/sgi0;

    .line 23
    .line 24
    iget-object v0, v0, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 25
    .line 26
    iget v1, v0, Lkotlin/ranges/a;->a:I

    .line 27
    .line 28
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 29
    .line 30
    add-int/2addr v1, v0

    .line 31
    iget-object v0, p1, La/fqs0;->c:La/sgi0;

    .line 32
    .line 33
    iget-object v0, v0, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 34
    .line 35
    iget v2, v0, Lkotlin/ranges/a;->a:I

    .line 36
    .line 37
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 38
    .line 39
    add-int/2addr v2, v0

    .line 40
    sub-int/2addr v1, v2

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, La/fqs0;->b()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, La/fqs0;->b()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    neg-int p0, v1

    .line 57
    return p0

    .line 58
    :cond_2
    :goto_0
    return v1

    .line 59
    :cond_3
    iget v0, p0, La/fqs0;->b:I

    .line 60
    .line 61
    iget p1, p1, La/fqs0;->b:I

    .line 62
    .line 63
    sub-int/2addr v0, p1

    .line 64
    invoke-virtual {p0}, La/fqs0;->c()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    neg-int p0, v0

    .line 71
    return p0

    .line 72
    :cond_4
    return v0

    .line 73
    :cond_5
    invoke-virtual {p0}, La/fqs0;->c()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_6

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :cond_6
    const/4 p0, -0x1

    .line 82
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/fqs0;->c:La/sgi0;

    .line 2
    .line 3
    iget-object p0, p0, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 4
    .line 5
    iget v0, p0, Lkotlin/ranges/a;->a:I

    .line 6
    .line 7
    iget p0, p0, Lkotlin/ranges/a;->b:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/fqs0;->c:La/sgi0;

    .line 2
    .line 3
    iget-object v0, v0, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 4
    .line 5
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 6
    .line 7
    iget p0, p0, La/fqs0;->a:I

    .line 8
    .line 9
    if-eq v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, La/fqs0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fqs0;->a(La/fqs0;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fqs0;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v1, "Open"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "Close"

    .line 13
    .line 14
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, ": "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v1, p0, La/fqs0;->a:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " ("

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/fqs0;->c:La/sgi0;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 p0, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
