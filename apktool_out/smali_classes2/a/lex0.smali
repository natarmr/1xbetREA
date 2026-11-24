.class public final La/lex0;
.super La/cgx0;
.source "SourceFile"


# instance fields
.field public final f:La/o0x0;


# direct methods
.method public synthetic constructor <init>(La/o0x0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1, v1, v0}, La/cgx0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/lex0;->f:La/o0x0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final y()Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, La/lex0;->f:La/o0x0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/o0x0;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    invoke-static {p0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
