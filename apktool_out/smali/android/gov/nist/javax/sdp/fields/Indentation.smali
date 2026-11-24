.class Landroid/gov/nist/javax/sdp/fields/Indentation;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private indentation:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    return-void
.end method


# virtual methods
.method public decrement()V
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 6
    .line 7
    return-void
.end method

.method public getCount()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 2
    .line 3
    return p0
.end method

.method public getIndentation()Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 2
    .line 3
    new-array p0, p0, [C

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([CC)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public increment()V
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 6
    .line 7
    return-void
.end method

.method public setIndentation(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sdp/fields/Indentation;->indentation:I

    .line 2
    .line 3
    return-void
.end method
