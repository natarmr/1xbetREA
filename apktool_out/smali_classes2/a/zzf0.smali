.class public abstract La/zzf0;
.super La/yzf0;
.source "SourceFile"

# interfaces
.implements La/ger;


# instance fields
.field private final i:I


# direct methods
.method public constructor <init>(ILa/yje;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, La/yzf0;-><init>(La/yje;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/zzf0;->i:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getArity()I
    .locals 0

    .line 1
    iget p0, p0, La/zzf0;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/zw5;->getCompletion()La/yje;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, La/sre0;->a:La/tre0;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, La/tre0;->i(La/ger;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-super {p0}, La/zw5;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
