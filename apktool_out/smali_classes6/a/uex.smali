.class public final La/uex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field public final synthetic a:La/vex;


# direct methods
.method public constructor <init>(La/vex;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uex;->a:La/vex;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-static {p1}, La/vex;->b(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object p0, p0, La/uex;->a:La/vex;

    .line 11
    .line 12
    iget-object p2, p0, La/vex;->h:Lkotlin/text/Regex;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/vex;->a(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, La/vex;->c()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object p1

    .line 34
    :cond_2
    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    const/4 p3, 0x0

    .line 44
    :goto_1
    if-ge p3, p2, :cond_4

    .line 45
    .line 46
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    invoke-static {p4}, Ljava/lang/Character;->isDigit(C)Z

    .line 51
    .line 52
    .line 53
    move-result p5

    .line 54
    if-eqz p5, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 57
    .line 58
    .line 59
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    return-object p0

    .line 63
    :cond_5
    :goto_2
    const-string p0, ""

    .line 64
    .line 65
    return-object p0
.end method
