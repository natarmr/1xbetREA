.class public final La/kdx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;

.field public static final s:Ljava/util/regex/Pattern;

.field public static final t:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/util/BitSet;

.field public final b:Ljava/util/BitSet;

.field public final c:Ljava/util/HashMap;

.field public final d:La/lbu;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:La/o6k;

.field public h:La/mr8;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "^[!\"#\\$%&\'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/kdx;->i:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"\'=<>`\\x00-\\x20]+|\'[^\']*\'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)"

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, La/kdx;->j:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    const-string v0, "^[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, La/kdx;->k:Ljava/util/regex/Pattern;

    .line 25
    .line 26
    const-string v0, "^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});"

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, La/kdx;->l:Ljava/util/regex/Pattern;

    .line 33
    .line 34
    const-string v0, "`+"

    .line 35
    .line 36
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, La/kdx;->m:Ljava/util/regex/Pattern;

    .line 41
    .line 42
    const-string v0, "^`+"

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, La/kdx;->n:Ljava/util/regex/Pattern;

    .line 49
    .line 50
    const-string v0, "^<([a-zA-Z0-9.!#$%&\'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>"

    .line 51
    .line 52
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, La/kdx;->o:Ljava/util/regex/Pattern;

    .line 57
    .line 58
    const-string v0, "^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>"

    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, La/kdx;->p:Ljava/util/regex/Pattern;

    .line 65
    .line 66
    const-string v0, "^ *(?:\n *)?"

    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, La/kdx;->q:Ljava/util/regex/Pattern;

    .line 73
    .line 74
    const-string v0, "^[\\p{Zs}\t\r\n\u000c]"

    .line 75
    .line 76
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, La/kdx;->r:Ljava/util/regex/Pattern;

    .line 81
    .line 82
    const-string v0, "\\s+"

    .line 83
    .line 84
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, La/kdx;->s:Ljava/util/regex/Pattern;

    .line 89
    .line 90
    const-string v0, " *$"

    .line 91
    .line 92
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, La/kdx;->t:Ljava/util/regex/Pattern;

    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>(La/lbu;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/lbu;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/vy3;

    .line 14
    .line 15
    const/16 v3, 0x2a

    .line 16
    .line 17
    invoke-direct {v2, v3}, La/vy3;-><init>(C)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/vy3;

    .line 21
    .line 22
    const/16 v4, 0x5f

    .line 23
    .line 24
    invoke-direct {v3, v4}, La/vy3;-><init>(C)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    new-array v4, v4, [La/q6k;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    aput-object v2, v4, v5

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aput-object v3, v4, v2

    .line 35
    .line 36
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2, v1}, La/kdx;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, La/kdx;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, La/kdx;->c:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ljava/util/BitSet;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/lang/Character;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    iput-object v1, p0, La/kdx;->b:Ljava/util/BitSet;

    .line 82
    .line 83
    new-instance v0, Ljava/util/BitSet;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0xa

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 94
    .line 95
    .line 96
    const/16 v1, 0x60

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 99
    .line 100
    .line 101
    const/16 v1, 0x5b

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 104
    .line 105
    .line 106
    const/16 v1, 0x5d

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 109
    .line 110
    .line 111
    const/16 v1, 0x5c

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 114
    .line 115
    .line 116
    const/16 v1, 0x21

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 119
    .line 120
    .line 121
    const/16 v1, 0x3c

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 124
    .line 125
    .line 126
    const/16 v1, 0x26

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, La/kdx;->a:Ljava/util/BitSet;

    .line 132
    .line 133
    iput-object p1, p0, La/kdx;->d:La/lbu;

    .line 134
    .line 135
    return-void
.end method

.method public static a(CLa/q6k;Ljava/util/HashMap;)V
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/q6k;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, "Delimiter processor conflict with delimiter char \'"

    .line 19
    .line 20
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "\'"

    .line 27
    .line 28
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public static b(Ljava/lang/Iterable;Ljava/util/HashMap;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/q6k;

    .line 16
    .line 17
    invoke-interface {v0}, La/q6k;->e()C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0}, La/q6k;->a()C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, La/q6k;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, La/q6k;->e()C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-interface {v2}, La/q6k;->a()C

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ne v3, v4, :cond_1

    .line 48
    .line 49
    instance-of v3, v2, La/x3m0;

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    check-cast v2, La/x3m0;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v3, La/x3m0;

    .line 57
    .line 58
    invoke-direct {v3, v1}, La/x3m0;-><init>(C)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, La/x3m0;->f(La/q6k;)V

    .line 62
    .line 63
    .line 64
    move-object v2, v3

    .line 65
    :goto_1
    invoke-virtual {v2, v0}, La/x3m0;->f(La/q6k;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-static {v1, v0, p1}, La/kdx;->a(CLa/q6k;Ljava/util/HashMap;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-static {v1, v0, p1}, La/kdx;->a(CLa/q6k;Ljava/util/HashMap;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v0, p1}, La/kdx;->a(CLa/q6k;Ljava/util/HashMap;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    return-void
.end method

.method public static d(La/e2q0;La/e2q0;I)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    if-eq p0, p1, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, La/e2q0;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, La/b4e;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, La/b4e;

    .line 20
    .line 21
    iget-object p1, p1, La/b4e;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, La/b4e;

    .line 24
    .line 25
    :goto_0
    if-eq p2, p1, :cond_0

    .line 26
    .line 27
    move-object v1, p2

    .line 28
    check-cast v1, La/e2q0;

    .line 29
    .line 30
    iget-object v1, v1, La/e2q0;->g:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p2, La/b4e;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, La/b4e;

    .line 38
    .line 39
    invoke-virtual {p2}, La/b4e;->j()V

    .line 40
    .line 41
    .line 42
    move-object p2, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/e2q0;->g:Ljava/lang/String;

    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public static e(La/b4e;La/b4e;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    move-object v3, v2

    .line 5
    move v4, v1

    .line 6
    :goto_0
    if-eqz p0, :cond_3

    .line 7
    .line 8
    instance-of v5, p0, La/e2q0;

    .line 9
    .line 10
    if-eqz v5, :cond_1

    .line 11
    .line 12
    move-object v3, p0

    .line 13
    check-cast v3, La/e2q0;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    move-object v2, v3

    .line 18
    :cond_0
    iget-object v5, v3, La/e2q0;->g:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    add-int/2addr v5, v4

    .line 25
    move v4, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {v2, v3, v4}, La/kdx;->d(La/e2q0;La/e2q0;I)V

    .line 28
    .line 29
    .line 30
    move-object v2, v0

    .line 31
    move-object v3, v2

    .line 32
    move v4, v1

    .line 33
    :goto_1
    if-ne p0, p1, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    iget-object p0, p0, La/b4e;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/b4e;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_2
    invoke-static {v2, v3, v4}, La/kdx;->d(La/e2q0;La/e2q0;I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final c(Ljava/util/regex/Pattern;)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, La/kdx;->f:I

    .line 2
    .line 3
    iget-object v1, p0, La/kdx;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    iget-object v0, p0, La/kdx;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget v0, p0, La/kdx;->f:I

    .line 20
    .line 21
    iget-object v1, p0, La/kdx;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1, v0, v1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, La/kdx;->f:I

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    return-object v2
.end method

.method public final f(Ljava/lang/String;La/b4e;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iput-object v2, v0, La/kdx;->e:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput v2, v0, La/kdx;->f:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput-object v3, v0, La/kdx;->g:La/o6k;

    .line 16
    .line 17
    iput-object v3, v0, La/kdx;->h:La/mr8;

    .line 18
    .line 19
    move-object v4, v3

    .line 20
    :goto_0
    invoke-virtual {v0}, La/kdx;->g()C

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-nez v7, :cond_0

    .line 25
    .line 26
    move v5, v2

    .line 27
    :goto_1
    move-object v4, v3

    .line 28
    goto/16 :goto_27

    .line 29
    .line 30
    :cond_0
    const-string v5, " "

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    const/16 v8, 0xa

    .line 34
    .line 35
    if-eq v7, v8, :cond_43

    .line 36
    .line 37
    const/16 v4, 0x21

    .line 38
    .line 39
    if-eq v7, v4, :cond_40

    .line 40
    .line 41
    const/16 v4, 0x26

    .line 42
    .line 43
    if-eq v7, v4, :cond_3f

    .line 44
    .line 45
    const/16 v4, 0x3c

    .line 46
    .line 47
    if-eq v7, v4, :cond_3c

    .line 48
    .line 49
    const/16 v10, 0x60

    .line 50
    .line 51
    if-eq v7, v10, :cond_36

    .line 52
    .line 53
    packed-switch v7, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    iget-object v4, v0, La/kdx;->b:Ljava/util/BitSet;

    .line 57
    .line 58
    invoke-virtual {v4, v7}, Ljava/util/BitSet;->get(I)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_13

    .line 63
    .line 64
    iget-object v4, v0, La/kdx;->c:Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, La/q6k;

    .line 75
    .line 76
    iget v5, v0, La/kdx;->f:I

    .line 77
    .line 78
    move v6, v2

    .line 79
    :goto_2
    invoke-virtual {v0}, La/kdx;->g()C

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-ne v8, v7, :cond_1

    .line 84
    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    iget v8, v0, La/kdx;->f:I

    .line 88
    .line 89
    add-int/2addr v8, v11

    .line 90
    iput v8, v0, La/kdx;->f:I

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_1
    invoke-interface {v4}, La/q6k;->d()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-ge v6, v8, :cond_2

    .line 98
    .line 99
    iput v5, v0, La/kdx;->f:I

    .line 100
    .line 101
    move-object v9, v3

    .line 102
    goto/16 :goto_b

    .line 103
    .line 104
    :cond_2
    const-string v8, "\n"

    .line 105
    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    move-object v9, v8

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 111
    .line 112
    add-int/lit8 v10, v5, -0x1

    .line 113
    .line 114
    invoke-virtual {v9, v10, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    :goto_3
    invoke-virtual {v0}, La/kdx;->g()C

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-nez v10, :cond_4

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    invoke-static {v10}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    :goto_4
    sget-object v10, La/kdx;->i:Ljava/util/regex/Pattern;

    .line 130
    .line 131
    invoke-virtual {v10, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    sget-object v13, La/kdx;->r:Ljava/util/regex/Pattern;

    .line 140
    .line 141
    invoke-virtual {v13, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    invoke-virtual {v10, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-nez v8, :cond_6

    .line 166
    .line 167
    if-eqz v10, :cond_5

    .line 168
    .line 169
    if-nez v9, :cond_5

    .line 170
    .line 171
    if-eqz v12, :cond_6

    .line 172
    .line 173
    :cond_5
    move v13, v11

    .line 174
    goto :goto_5

    .line 175
    :cond_6
    move v13, v2

    .line 176
    :goto_5
    if-nez v9, :cond_8

    .line 177
    .line 178
    if-eqz v12, :cond_7

    .line 179
    .line 180
    if-nez v8, :cond_7

    .line 181
    .line 182
    if-eqz v10, :cond_8

    .line 183
    .line 184
    :cond_7
    move v8, v11

    .line 185
    goto :goto_6

    .line 186
    :cond_8
    move v8, v2

    .line 187
    :goto_6
    const/16 v9, 0x5f

    .line 188
    .line 189
    if-ne v7, v9, :cond_d

    .line 190
    .line 191
    if-eqz v13, :cond_a

    .line 192
    .line 193
    if-eqz v8, :cond_9

    .line 194
    .line 195
    if-eqz v12, :cond_a

    .line 196
    .line 197
    :cond_9
    move v4, v11

    .line 198
    goto :goto_7

    .line 199
    :cond_a
    move v4, v2

    .line 200
    :goto_7
    if-eqz v8, :cond_c

    .line 201
    .line 202
    if-eqz v13, :cond_b

    .line 203
    .line 204
    if-eqz v10, :cond_c

    .line 205
    .line 206
    :cond_b
    move v8, v11

    .line 207
    goto :goto_a

    .line 208
    :cond_c
    move v8, v2

    .line 209
    goto :goto_a

    .line 210
    :cond_d
    if-eqz v13, :cond_e

    .line 211
    .line 212
    invoke-interface {v4}, La/q6k;->e()C

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-ne v7, v9, :cond_e

    .line 217
    .line 218
    move v9, v11

    .line 219
    goto :goto_8

    .line 220
    :cond_e
    move v9, v2

    .line 221
    :goto_8
    if-eqz v8, :cond_f

    .line 222
    .line 223
    invoke-interface {v4}, La/q6k;->a()C

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-ne v7, v4, :cond_f

    .line 228
    .line 229
    move v8, v11

    .line 230
    goto :goto_9

    .line 231
    :cond_f
    move v8, v2

    .line 232
    :goto_9
    move v4, v9

    .line 233
    :goto_a
    iput v5, v0, La/kdx;->f:I

    .line 234
    .line 235
    new-instance v9, La/jdx;

    .line 236
    .line 237
    invoke-direct {v9, v6, v4, v8}, La/jdx;-><init>(IZZ)V

    .line 238
    .line 239
    .line 240
    :goto_b
    if-nez v9, :cond_11

    .line 241
    .line 242
    :cond_10
    move-object v10, v3

    .line 243
    goto :goto_c

    .line 244
    :cond_11
    iget v4, v9, La/jdx;->a:I

    .line 245
    .line 246
    add-int v6, v5, v4

    .line 247
    .line 248
    iput v6, v0, La/kdx;->f:I

    .line 249
    .line 250
    iget-object v8, v0, La/kdx;->e:Ljava/lang/String;

    .line 251
    .line 252
    new-instance v10, La/e2q0;

    .line 253
    .line 254
    invoke-virtual {v8, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-direct {v10, v5}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    new-instance v5, La/o6k;

    .line 262
    .line 263
    iget-boolean v8, v9, La/jdx;->c:Z

    .line 264
    .line 265
    iget-boolean v9, v9, La/jdx;->b:Z

    .line 266
    .line 267
    move-object v6, v10

    .line 268
    iget-object v10, v0, La/kdx;->g:La/o6k;

    .line 269
    .line 270
    invoke-direct/range {v5 .. v10}, La/o6k;-><init>(La/e2q0;CZZLa/o6k;)V

    .line 271
    .line 272
    .line 273
    iput-object v5, v0, La/kdx;->g:La/o6k;

    .line 274
    .line 275
    iput v4, v5, La/o6k;->g:I

    .line 276
    .line 277
    iput v4, v5, La/o6k;->h:I

    .line 278
    .line 279
    if-eqz v10, :cond_12

    .line 280
    .line 281
    iput-object v5, v10, La/o6k;->f:La/o6k;

    .line 282
    .line 283
    :cond_12
    move-object v10, v6

    .line 284
    :goto_c
    move v5, v2

    .line 285
    goto/16 :goto_26

    .line 286
    .line 287
    :cond_13
    iget v4, v0, La/kdx;->f:I

    .line 288
    .line 289
    iget-object v5, v0, La/kdx;->e:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    :goto_d
    iget v6, v0, La/kdx;->f:I

    .line 296
    .line 297
    if-eq v6, v5, :cond_15

    .line 298
    .line 299
    iget-object v8, v0, La/kdx;->e:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    iget-object v8, v0, La/kdx;->a:Ljava/util/BitSet;

    .line 306
    .line 307
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->get(I)Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_14

    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_14
    iget v6, v0, La/kdx;->f:I

    .line 315
    .line 316
    add-int/2addr v6, v11

    .line 317
    iput v6, v0, La/kdx;->f:I

    .line 318
    .line 319
    goto :goto_d

    .line 320
    :cond_15
    :goto_e
    iget v5, v0, La/kdx;->f:I

    .line 321
    .line 322
    if-eq v4, v5, :cond_10

    .line 323
    .line 324
    iget-object v6, v0, La/kdx;->e:Ljava/lang/String;

    .line 325
    .line 326
    new-instance v8, La/e2q0;

    .line 327
    .line 328
    invoke-virtual {v6, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-direct {v8, v4}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    move-object v10, v8

    .line 336
    goto :goto_c

    .line 337
    :pswitch_0
    iget v8, v0, La/kdx;->f:I

    .line 338
    .line 339
    add-int/2addr v8, v11

    .line 340
    iput v8, v0, La/kdx;->f:I

    .line 341
    .line 342
    iget-object v10, v0, La/kdx;->h:La/mr8;

    .line 343
    .line 344
    const-string v12, "]"

    .line 345
    .line 346
    if-nez v10, :cond_17

    .line 347
    .line 348
    new-instance v4, La/e2q0;

    .line 349
    .line 350
    invoke-direct {v4, v12}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_16
    :goto_f
    move-object v10, v4

    .line 354
    goto/16 :goto_20

    .line 355
    .line 356
    :cond_17
    iget-object v13, v10, La/mr8;->a:La/e2q0;

    .line 357
    .line 358
    iget-boolean v14, v10, La/mr8;->c:Z

    .line 359
    .line 360
    iget-boolean v15, v10, La/mr8;->f:Z

    .line 361
    .line 362
    if-nez v15, :cond_18

    .line 363
    .line 364
    iget-object v4, v10, La/mr8;->d:La/mr8;

    .line 365
    .line 366
    iput-object v4, v0, La/kdx;->h:La/mr8;

    .line 367
    .line 368
    new-instance v4, La/e2q0;

    .line 369
    .line 370
    invoke-direct {v4, v12}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_f

    .line 374
    :cond_18
    invoke-virtual {v0}, La/kdx;->g()C

    .line 375
    .line 376
    .line 377
    move-result v15

    .line 378
    const/16 v3, 0x28

    .line 379
    .line 380
    const/4 v2, -0x1

    .line 381
    if-ne v15, v3, :cond_25

    .line 382
    .line 383
    iget v15, v0, La/kdx;->f:I

    .line 384
    .line 385
    add-int/2addr v15, v11

    .line 386
    iput v15, v0, La/kdx;->f:I

    .line 387
    .line 388
    sget-object v15, La/kdx;->q:Ljava/util/regex/Pattern;

    .line 389
    .line 390
    invoke-virtual {v0, v15}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move/from16 v16, v11

    .line 394
    .line 395
    iget-object v11, v0, La/kdx;->e:Ljava/lang/String;

    .line 396
    .line 397
    iget v6, v0, La/kdx;->f:I

    .line 398
    .line 399
    invoke-static {v6, v11}, La/ufx;->G(ILjava/lang/CharSequence;)I

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-ne v6, v2, :cond_19

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    goto :goto_11

    .line 407
    :cond_19
    invoke-virtual {v0}, La/kdx;->g()C

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 412
    .line 413
    iget v2, v0, La/kdx;->f:I

    .line 414
    .line 415
    if-ne v11, v4, :cond_1a

    .line 416
    .line 417
    add-int/lit8 v2, v2, 0x1

    .line 418
    .line 419
    add-int/lit8 v4, v6, -0x1

    .line 420
    .line 421
    invoke-virtual {v9, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    goto :goto_10

    .line 426
    :cond_1a
    invoke-virtual {v9, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    :goto_10
    iput v6, v0, La/kdx;->f:I

    .line 431
    .line 432
    invoke-static {v2}, La/k2o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    :goto_11
    if-eqz v2, :cond_24

    .line 437
    .line 438
    invoke-virtual {v0, v15}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    iget-object v4, v0, La/kdx;->e:Ljava/lang/String;

    .line 442
    .line 443
    iget v6, v0, La/kdx;->f:I

    .line 444
    .line 445
    add-int/lit8 v9, v6, -0x1

    .line 446
    .line 447
    invoke-virtual {v4, v9, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    sget-object v6, La/kdx;->s:Ljava/util/regex/Pattern;

    .line 452
    .line 453
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-eqz v4, :cond_22

    .line 462
    .line 463
    iget-object v4, v0, La/kdx;->e:Ljava/lang/String;

    .line 464
    .line 465
    iget v9, v0, La/kdx;->f:I

    .line 466
    .line 467
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    if-lt v9, v11, :cond_1c

    .line 472
    .line 473
    :cond_1b
    :goto_12
    const/4 v3, -0x1

    .line 474
    const/4 v9, -0x1

    .line 475
    goto :goto_13

    .line 476
    :cond_1c
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    const/16 v6, 0x22

    .line 481
    .line 482
    if-eq v11, v6, :cond_1e

    .line 483
    .line 484
    const/16 v6, 0x27

    .line 485
    .line 486
    if-eq v11, v6, :cond_1e

    .line 487
    .line 488
    if-eq v11, v3, :cond_1d

    .line 489
    .line 490
    goto :goto_12

    .line 491
    :cond_1d
    const/16 v6, 0x29

    .line 492
    .line 493
    :cond_1e
    add-int/lit8 v9, v9, 0x1

    .line 494
    .line 495
    invoke-static {v4, v9, v6}, La/ufx;->I(Ljava/lang/CharSequence;IC)I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    const/4 v9, -0x1

    .line 500
    if-ne v3, v9, :cond_1f

    .line 501
    .line 502
    goto :goto_12

    .line 503
    :cond_1f
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    if-ge v3, v9, :cond_1b

    .line 508
    .line 509
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eq v4, v6, :cond_20

    .line 514
    .line 515
    goto :goto_12

    .line 516
    :cond_20
    add-int/lit8 v3, v3, 0x1

    .line 517
    .line 518
    move v9, v3

    .line 519
    const/4 v3, -0x1

    .line 520
    :goto_13
    if-ne v9, v3, :cond_21

    .line 521
    .line 522
    const/4 v3, 0x0

    .line 523
    goto :goto_14

    .line 524
    :cond_21
    iget-object v3, v0, La/kdx;->e:Ljava/lang/String;

    .line 525
    .line 526
    iget v4, v0, La/kdx;->f:I

    .line 527
    .line 528
    add-int/lit8 v4, v4, 0x1

    .line 529
    .line 530
    add-int/lit8 v6, v9, -0x1

    .line 531
    .line 532
    invoke-virtual {v3, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    iput v9, v0, La/kdx;->f:I

    .line 537
    .line 538
    invoke-static {v3}, La/k2o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    :goto_14
    invoke-virtual {v0, v15}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    goto :goto_15

    .line 546
    :cond_22
    const/4 v3, 0x0

    .line 547
    :goto_15
    invoke-virtual {v0}, La/kdx;->g()C

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    const/16 v6, 0x29

    .line 552
    .line 553
    if-ne v4, v6, :cond_23

    .line 554
    .line 555
    iget v4, v0, La/kdx;->f:I

    .line 556
    .line 557
    add-int/lit8 v4, v4, 0x1

    .line 558
    .line 559
    iput v4, v0, La/kdx;->f:I

    .line 560
    .line 561
    move/from16 v4, v16

    .line 562
    .line 563
    goto :goto_18

    .line 564
    :cond_23
    iput v8, v0, La/kdx;->f:I

    .line 565
    .line 566
    :goto_16
    const/4 v4, 0x0

    .line 567
    goto :goto_18

    .line 568
    :cond_24
    :goto_17
    const/4 v3, 0x0

    .line 569
    goto :goto_16

    .line 570
    :cond_25
    move/from16 v16, v11

    .line 571
    .line 572
    const/4 v2, 0x0

    .line 573
    goto :goto_17

    .line 574
    :goto_18
    if-nez v4, :cond_2c

    .line 575
    .line 576
    iget v6, v0, La/kdx;->f:I

    .line 577
    .line 578
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 579
    .line 580
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 581
    .line 582
    .line 583
    move-result v9

    .line 584
    if-ge v6, v9, :cond_29

    .line 585
    .line 586
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 587
    .line 588
    iget v11, v0, La/kdx;->f:I

    .line 589
    .line 590
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    .line 591
    .line 592
    .line 593
    move-result v9

    .line 594
    const/16 v11, 0x5b

    .line 595
    .line 596
    if-eq v9, v11, :cond_26

    .line 597
    .line 598
    goto :goto_19

    .line 599
    :cond_26
    iget v9, v0, La/kdx;->f:I

    .line 600
    .line 601
    add-int/lit8 v9, v9, 0x1

    .line 602
    .line 603
    iget-object v11, v0, La/kdx;->e:Ljava/lang/String;

    .line 604
    .line 605
    invoke-static {v9, v11}, La/ufx;->H(ILjava/lang/CharSequence;)I

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    sub-int v9, v11, v9

    .line 610
    .line 611
    const/4 v15, -0x1

    .line 612
    if-eq v11, v15, :cond_29

    .line 613
    .line 614
    const/16 v15, 0x3e7

    .line 615
    .line 616
    if-le v9, v15, :cond_27

    .line 617
    .line 618
    goto :goto_19

    .line 619
    :cond_27
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 620
    .line 621
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 622
    .line 623
    .line 624
    move-result v9

    .line 625
    if-ge v11, v9, :cond_29

    .line 626
    .line 627
    iget-object v9, v0, La/kdx;->e:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    const/16 v15, 0x5d

    .line 634
    .line 635
    if-eq v9, v15, :cond_28

    .line 636
    .line 637
    goto :goto_19

    .line 638
    :cond_28
    add-int/lit8 v11, v11, 0x1

    .line 639
    .line 640
    iput v11, v0, La/kdx;->f:I

    .line 641
    .line 642
    :cond_29
    :goto_19
    iget v9, v0, La/kdx;->f:I

    .line 643
    .line 644
    sub-int/2addr v9, v6

    .line 645
    const/4 v11, 0x2

    .line 646
    if-le v9, v11, :cond_2a

    .line 647
    .line 648
    iget-object v11, v0, La/kdx;->e:Ljava/lang/String;

    .line 649
    .line 650
    add-int/2addr v9, v6

    .line 651
    invoke-virtual {v11, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    goto :goto_1a

    .line 656
    :cond_2a
    iget-boolean v6, v10, La/mr8;->g:Z

    .line 657
    .line 658
    if-nez v6, :cond_2b

    .line 659
    .line 660
    iget-object v6, v0, La/kdx;->e:Ljava/lang/String;

    .line 661
    .line 662
    iget v9, v10, La/mr8;->b:I

    .line 663
    .line 664
    invoke-virtual {v6, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v6

    .line 668
    goto :goto_1a

    .line 669
    :cond_2b
    const/4 v6, 0x0

    .line 670
    :goto_1a
    if-eqz v6, :cond_2c

    .line 671
    .line 672
    sget-object v9, La/k2o;->a:Ljava/util/regex/Pattern;

    .line 673
    .line 674
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    add-int/lit8 v9, v9, -0x1

    .line 679
    .line 680
    move/from16 v11, v16

    .line 681
    .line 682
    invoke-virtual {v6, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 691
    .line 692
    invoke-virtual {v6, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    sget-object v9, La/k2o;->c:Ljava/util/regex/Pattern;

    .line 697
    .line 698
    invoke-virtual {v9, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    invoke-virtual {v6, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    iget-object v6, v0, La/kdx;->d:La/lbu;

    .line 707
    .line 708
    iget-object v6, v6, La/lbu;->c:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v6, Ljava/util/Map;

    .line 711
    .line 712
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v5

    .line 716
    check-cast v5, La/rb00;

    .line 717
    .line 718
    if-eqz v5, :cond_2c

    .line 719
    .line 720
    iget-object v2, v5, La/rb00;->h:Ljava/lang/String;

    .line 721
    .line 722
    iget-object v3, v5, La/rb00;->i:Ljava/lang/String;

    .line 723
    .line 724
    const/4 v4, 0x1

    .line 725
    :cond_2c
    if-eqz v4, :cond_31

    .line 726
    .line 727
    if-eqz v14, :cond_2d

    .line 728
    .line 729
    new-instance v4, La/cyw;

    .line 730
    .line 731
    invoke-direct {v4}, La/b4e;-><init>()V

    .line 732
    .line 733
    .line 734
    iput-object v2, v4, La/cyw;->g:Ljava/lang/String;

    .line 735
    .line 736
    iput-object v3, v4, La/cyw;->h:Ljava/lang/String;

    .line 737
    .line 738
    goto :goto_1b

    .line 739
    :cond_2d
    new-instance v4, La/hb00;

    .line 740
    .line 741
    invoke-direct {v4, v2, v3}, La/hb00;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    :goto_1b
    iget-object v2, v13, La/b4e;->f:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v2, La/b4e;

    .line 747
    .line 748
    :goto_1c
    if-eqz v2, :cond_2e

    .line 749
    .line 750
    iget-object v3, v2, La/b4e;->f:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v3, La/b4e;

    .line 753
    .line 754
    invoke-virtual {v4, v2}, La/b4e;->b(La/b4e;)V

    .line 755
    .line 756
    .line 757
    move-object v2, v3

    .line 758
    goto :goto_1c

    .line 759
    :cond_2e
    iget-object v2, v10, La/mr8;->e:La/o6k;

    .line 760
    .line 761
    invoke-virtual {v0, v2}, La/kdx;->h(La/o6k;)V

    .line 762
    .line 763
    .line 764
    iget-object v2, v4, La/b4e;->c:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v2, La/b4e;

    .line 767
    .line 768
    iget-object v3, v4, La/b4e;->d:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v3, La/b4e;

    .line 771
    .line 772
    if-ne v2, v3, :cond_2f

    .line 773
    .line 774
    goto :goto_1d

    .line 775
    :cond_2f
    invoke-static {v2, v3}, La/kdx;->e(La/b4e;La/b4e;)V

    .line 776
    .line 777
    .line 778
    :goto_1d
    invoke-virtual {v13}, La/b4e;->j()V

    .line 779
    .line 780
    .line 781
    iget-object v2, v0, La/kdx;->h:La/mr8;

    .line 782
    .line 783
    iget-object v2, v2, La/mr8;->d:La/mr8;

    .line 784
    .line 785
    iput-object v2, v0, La/kdx;->h:La/mr8;

    .line 786
    .line 787
    if-nez v14, :cond_16

    .line 788
    .line 789
    :goto_1e
    if-eqz v2, :cond_16

    .line 790
    .line 791
    iget-boolean v3, v2, La/mr8;->c:Z

    .line 792
    .line 793
    if-nez v3, :cond_30

    .line 794
    .line 795
    const/4 v3, 0x0

    .line 796
    iput-boolean v3, v2, La/mr8;->f:Z

    .line 797
    .line 798
    :cond_30
    iget-object v2, v2, La/mr8;->d:La/mr8;

    .line 799
    .line 800
    goto :goto_1e

    .line 801
    :cond_31
    iput v8, v0, La/kdx;->f:I

    .line 802
    .line 803
    iget-object v2, v0, La/kdx;->h:La/mr8;

    .line 804
    .line 805
    iget-object v2, v2, La/mr8;->d:La/mr8;

    .line 806
    .line 807
    iput-object v2, v0, La/kdx;->h:La/mr8;

    .line 808
    .line 809
    new-instance v2, La/e2q0;

    .line 810
    .line 811
    invoke-direct {v2, v12}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 812
    .line 813
    .line 814
    :goto_1f
    move-object v10, v2

    .line 815
    :cond_32
    :goto_20
    const/4 v5, 0x0

    .line 816
    goto/16 :goto_26

    .line 817
    .line 818
    :pswitch_1
    iget v2, v0, La/kdx;->f:I

    .line 819
    .line 820
    const/16 v16, 0x1

    .line 821
    .line 822
    add-int/lit8 v2, v2, 0x1

    .line 823
    .line 824
    iput v2, v0, La/kdx;->f:I

    .line 825
    .line 826
    invoke-virtual {v0}, La/kdx;->g()C

    .line 827
    .line 828
    .line 829
    move-result v2

    .line 830
    if-ne v2, v8, :cond_33

    .line 831
    .line 832
    new-instance v2, La/qmv;

    .line 833
    .line 834
    invoke-direct {v2}, La/b4e;-><init>()V

    .line 835
    .line 836
    .line 837
    iget v3, v0, La/kdx;->f:I

    .line 838
    .line 839
    add-int/lit8 v3, v3, 0x1

    .line 840
    .line 841
    iput v3, v0, La/kdx;->f:I

    .line 842
    .line 843
    goto :goto_1f

    .line 844
    :cond_33
    iget v2, v0, La/kdx;->f:I

    .line 845
    .line 846
    iget-object v3, v0, La/kdx;->e:Ljava/lang/String;

    .line 847
    .line 848
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    if-ge v2, v3, :cond_34

    .line 853
    .line 854
    iget-object v2, v0, La/kdx;->e:Ljava/lang/String;

    .line 855
    .line 856
    iget v3, v0, La/kdx;->f:I

    .line 857
    .line 858
    add-int/lit8 v4, v3, 0x1

    .line 859
    .line 860
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    sget-object v3, La/kdx;->k:Ljava/util/regex/Pattern;

    .line 865
    .line 866
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 871
    .line 872
    .line 873
    move-result v2

    .line 874
    if-eqz v2, :cond_34

    .line 875
    .line 876
    iget-object v2, v0, La/kdx;->e:Ljava/lang/String;

    .line 877
    .line 878
    iget v3, v0, La/kdx;->f:I

    .line 879
    .line 880
    add-int/lit8 v4, v3, 0x1

    .line 881
    .line 882
    new-instance v5, La/e2q0;

    .line 883
    .line 884
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-direct {v5, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    iget v2, v0, La/kdx;->f:I

    .line 892
    .line 893
    const/16 v16, 0x1

    .line 894
    .line 895
    add-int/lit8 v2, v2, 0x1

    .line 896
    .line 897
    iput v2, v0, La/kdx;->f:I

    .line 898
    .line 899
    move-object v10, v5

    .line 900
    goto :goto_20

    .line 901
    :cond_34
    new-instance v2, La/e2q0;

    .line 902
    .line 903
    const-string v3, "\\"

    .line 904
    .line 905
    invoke-direct {v2, v3}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    goto :goto_1f

    .line 909
    :pswitch_2
    iget v2, v0, La/kdx;->f:I

    .line 910
    .line 911
    add-int/lit8 v3, v2, 0x1

    .line 912
    .line 913
    iput v3, v0, La/kdx;->f:I

    .line 914
    .line 915
    new-instance v3, La/e2q0;

    .line 916
    .line 917
    const-string v4, "["

    .line 918
    .line 919
    invoke-direct {v3, v4}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    iget-object v4, v0, La/kdx;->h:La/mr8;

    .line 923
    .line 924
    iget-object v5, v0, La/kdx;->g:La/o6k;

    .line 925
    .line 926
    new-instance v17, La/mr8;

    .line 927
    .line 928
    const/16 v22, 0x0

    .line 929
    .line 930
    move/from16 v19, v2

    .line 931
    .line 932
    move-object/from16 v18, v3

    .line 933
    .line 934
    move-object/from16 v20, v4

    .line 935
    .line 936
    move-object/from16 v21, v5

    .line 937
    .line 938
    invoke-direct/range {v17 .. v22}, La/mr8;-><init>(La/e2q0;ILa/mr8;La/o6k;Z)V

    .line 939
    .line 940
    .line 941
    move-object/from16 v3, v17

    .line 942
    .line 943
    move-object/from16 v2, v20

    .line 944
    .line 945
    if-eqz v2, :cond_35

    .line 946
    .line 947
    const/4 v11, 0x1

    .line 948
    iput-boolean v11, v2, La/mr8;->g:Z

    .line 949
    .line 950
    :cond_35
    iput-object v3, v0, La/kdx;->h:La/mr8;

    .line 951
    .line 952
    move-object/from16 v10, v18

    .line 953
    .line 954
    goto/16 :goto_20

    .line 955
    .line 956
    :cond_36
    sget-object v2, La/kdx;->n:Ljava/util/regex/Pattern;

    .line 957
    .line 958
    invoke-virtual {v0, v2}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    if-nez v2, :cond_38

    .line 963
    .line 964
    :cond_37
    const/4 v10, 0x0

    .line 965
    goto/16 :goto_20

    .line 966
    .line 967
    :cond_38
    iget v3, v0, La/kdx;->f:I

    .line 968
    .line 969
    :cond_39
    sget-object v4, La/kdx;->m:Ljava/util/regex/Pattern;

    .line 970
    .line 971
    invoke-virtual {v0, v4}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    if-eqz v4, :cond_3b

    .line 976
    .line 977
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    if-eqz v4, :cond_39

    .line 982
    .line 983
    new-instance v4, La/vxc;

    .line 984
    .line 985
    invoke-direct {v4}, La/b4e;-><init>()V

    .line 986
    .line 987
    .line 988
    iget-object v5, v0, La/kdx;->e:Ljava/lang/String;

    .line 989
    .line 990
    iget v6, v0, La/kdx;->f:I

    .line 991
    .line 992
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    sub-int/2addr v6, v2

    .line 997
    invoke-virtual {v5, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const/16 v3, 0x20

    .line 1002
    .line 1003
    invoke-virtual {v2, v8, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1008
    .line 1009
    .line 1010
    move-result v5

    .line 1011
    const/4 v6, 0x3

    .line 1012
    if-lt v5, v6, :cond_3a

    .line 1013
    .line 1014
    const/4 v5, 0x0

    .line 1015
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 1016
    .line 1017
    .line 1018
    move-result v6

    .line 1019
    if-ne v6, v3, :cond_3a

    .line 1020
    .line 1021
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1022
    .line 1023
    .line 1024
    move-result v6

    .line 1025
    const/4 v11, 0x1

    .line 1026
    sub-int/2addr v6, v11

    .line 1027
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 1028
    .line 1029
    .line 1030
    move-result v6

    .line 1031
    if-ne v6, v3, :cond_3a

    .line 1032
    .line 1033
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    invoke-static {v3, v5, v6, v2}, La/x8x;->z(CIILjava/lang/CharSequence;)I

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    if-eq v3, v6, :cond_3a

    .line 1042
    .line 1043
    invoke-static {v11, v11, v2}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    :cond_3a
    iput-object v2, v4, La/vxc;->g:Ljava/lang/String;

    .line 1048
    .line 1049
    goto/16 :goto_f

    .line 1050
    .line 1051
    :cond_3b
    iput v3, v0, La/kdx;->f:I

    .line 1052
    .line 1053
    new-instance v3, La/e2q0;

    .line 1054
    .line 1055
    invoke-direct {v3, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    :goto_21
    move-object v10, v3

    .line 1059
    goto/16 :goto_20

    .line 1060
    .line 1061
    :cond_3c
    sget-object v2, La/kdx;->o:Ljava/util/regex/Pattern;

    .line 1062
    .line 1063
    invoke-virtual {v0, v2}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    if-eqz v2, :cond_3d

    .line 1068
    .line 1069
    const/4 v11, 0x1

    .line 1070
    invoke-static {v11, v11, v2}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    new-instance v3, La/hb00;

    .line 1075
    .line 1076
    const-string v4, "mailto:"

    .line 1077
    .line 1078
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    const/4 v5, 0x0

    .line 1083
    invoke-direct {v3, v4, v5}, La/hb00;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v4, La/e2q0;

    .line 1087
    .line 1088
    invoke-direct {v4, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v3, v4}, La/b4e;->b(La/b4e;)V

    .line 1092
    .line 1093
    .line 1094
    :goto_22
    move-object v10, v3

    .line 1095
    goto :goto_23

    .line 1096
    :cond_3d
    const/4 v5, 0x0

    .line 1097
    sget-object v2, La/kdx;->p:Ljava/util/regex/Pattern;

    .line 1098
    .line 1099
    invoke-virtual {v0, v2}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    if-eqz v2, :cond_3e

    .line 1104
    .line 1105
    const/4 v11, 0x1

    .line 1106
    invoke-static {v11, v11, v2}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    new-instance v3, La/hb00;

    .line 1111
    .line 1112
    invoke-direct {v3, v2, v5}, La/hb00;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    new-instance v4, La/e2q0;

    .line 1116
    .line 1117
    invoke-direct {v4, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v3, v4}, La/b4e;->b(La/b4e;)V

    .line 1121
    .line 1122
    .line 1123
    goto :goto_22

    .line 1124
    :cond_3e
    const/4 v10, 0x0

    .line 1125
    :goto_23
    if-nez v10, :cond_32

    .line 1126
    .line 1127
    sget-object v2, La/kdx;->j:Ljava/util/regex/Pattern;

    .line 1128
    .line 1129
    invoke-virtual {v0, v2}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    if-eqz v2, :cond_37

    .line 1134
    .line 1135
    new-instance v2, La/itw;

    .line 1136
    .line 1137
    invoke-direct {v2}, La/b4e;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    goto/16 :goto_1f

    .line 1141
    .line 1142
    :cond_3f
    sget-object v2, La/kdx;->l:Ljava/util/regex/Pattern;

    .line 1143
    .line 1144
    invoke-virtual {v0, v2}, La/kdx;->c(Ljava/util/regex/Pattern;)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    if-eqz v2, :cond_37

    .line 1149
    .line 1150
    invoke-static {v2}, La/ctw;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    new-instance v3, La/e2q0;

    .line 1155
    .line 1156
    invoke-direct {v3, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_21

    .line 1160
    :cond_40
    iget v2, v0, La/kdx;->f:I

    .line 1161
    .line 1162
    const/4 v11, 0x1

    .line 1163
    add-int/2addr v2, v11

    .line 1164
    iput v2, v0, La/kdx;->f:I

    .line 1165
    .line 1166
    invoke-virtual {v0}, La/kdx;->g()C

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    const/16 v4, 0x5b

    .line 1171
    .line 1172
    if-ne v3, v4, :cond_42

    .line 1173
    .line 1174
    iget v3, v0, La/kdx;->f:I

    .line 1175
    .line 1176
    add-int/2addr v3, v11

    .line 1177
    iput v3, v0, La/kdx;->f:I

    .line 1178
    .line 1179
    new-instance v3, La/e2q0;

    .line 1180
    .line 1181
    const-string v4, "!["

    .line 1182
    .line 1183
    invoke-direct {v3, v4}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    iget-object v4, v0, La/kdx;->h:La/mr8;

    .line 1187
    .line 1188
    iget-object v5, v0, La/kdx;->g:La/o6k;

    .line 1189
    .line 1190
    new-instance v19, La/mr8;

    .line 1191
    .line 1192
    const/16 v24, 0x1

    .line 1193
    .line 1194
    move/from16 v21, v2

    .line 1195
    .line 1196
    move-object/from16 v20, v3

    .line 1197
    .line 1198
    move-object/from16 v22, v4

    .line 1199
    .line 1200
    move-object/from16 v23, v5

    .line 1201
    .line 1202
    invoke-direct/range {v19 .. v24}, La/mr8;-><init>(La/e2q0;ILa/mr8;La/o6k;Z)V

    .line 1203
    .line 1204
    .line 1205
    move-object/from16 v3, v19

    .line 1206
    .line 1207
    move-object/from16 v2, v22

    .line 1208
    .line 1209
    if-eqz v2, :cond_41

    .line 1210
    .line 1211
    iput-boolean v11, v2, La/mr8;->g:Z

    .line 1212
    .line 1213
    :cond_41
    iput-object v3, v0, La/kdx;->h:La/mr8;

    .line 1214
    .line 1215
    move-object/from16 v10, v20

    .line 1216
    .line 1217
    goto/16 :goto_20

    .line 1218
    .line 1219
    :cond_42
    new-instance v2, La/e2q0;

    .line 1220
    .line 1221
    const-string v3, "!"

    .line 1222
    .line 1223
    invoke-direct {v2, v3}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    goto/16 :goto_1f

    .line 1227
    .line 1228
    :cond_43
    iget v2, v0, La/kdx;->f:I

    .line 1229
    .line 1230
    add-int/2addr v2, v11

    .line 1231
    iput v2, v0, La/kdx;->f:I

    .line 1232
    .line 1233
    instance-of v2, v4, La/e2q0;

    .line 1234
    .line 1235
    if-eqz v2, :cond_47

    .line 1236
    .line 1237
    check-cast v4, La/e2q0;

    .line 1238
    .line 1239
    iget-object v2, v4, La/e2q0;->g:Ljava/lang/String;

    .line 1240
    .line 1241
    invoke-virtual {v2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v2

    .line 1245
    if-eqz v2, :cond_47

    .line 1246
    .line 1247
    iget-object v2, v4, La/e2q0;->g:Ljava/lang/String;

    .line 1248
    .line 1249
    sget-object v3, La/kdx;->t:Ljava/util/regex/Pattern;

    .line 1250
    .line 1251
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v3

    .line 1255
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v5

    .line 1259
    if-eqz v5, :cond_44

    .line 1260
    .line 1261
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    .line 1262
    .line 1263
    .line 1264
    move-result v5

    .line 1265
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    .line 1266
    .line 1267
    .line 1268
    move-result v3

    .line 1269
    sub-int v3, v5, v3

    .line 1270
    .line 1271
    goto :goto_24

    .line 1272
    :cond_44
    const/4 v3, 0x0

    .line 1273
    :goto_24
    const/4 v5, 0x0

    .line 1274
    if-lez v3, :cond_45

    .line 1275
    .line 1276
    invoke-static {v3, v5, v2}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    iput-object v2, v4, La/e2q0;->g:Ljava/lang/String;

    .line 1281
    .line 1282
    :cond_45
    const/4 v11, 0x2

    .line 1283
    if-lt v3, v11, :cond_46

    .line 1284
    .line 1285
    new-instance v2, La/qmv;

    .line 1286
    .line 1287
    invoke-direct {v2}, La/b4e;-><init>()V

    .line 1288
    .line 1289
    .line 1290
    :goto_25
    move-object v10, v2

    .line 1291
    goto :goto_26

    .line 1292
    :cond_46
    new-instance v2, La/okk0;

    .line 1293
    .line 1294
    invoke-direct {v2}, La/b4e;-><init>()V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_25

    .line 1298
    :cond_47
    const/4 v5, 0x0

    .line 1299
    new-instance v2, La/okk0;

    .line 1300
    .line 1301
    invoke-direct {v2}, La/b4e;-><init>()V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_25

    .line 1305
    :goto_26
    if-eqz v10, :cond_48

    .line 1306
    .line 1307
    move-object v4, v10

    .line 1308
    goto :goto_27

    .line 1309
    :cond_48
    iget v2, v0, La/kdx;->f:I

    .line 1310
    .line 1311
    const/16 v16, 0x1

    .line 1312
    .line 1313
    add-int/lit8 v2, v2, 0x1

    .line 1314
    .line 1315
    iput v2, v0, La/kdx;->f:I

    .line 1316
    .line 1317
    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    new-instance v3, La/e2q0;

    .line 1322
    .line 1323
    invoke-direct {v3, v2}, La/e2q0;-><init>(Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    goto/16 :goto_1

    .line 1327
    .line 1328
    :goto_27
    if-eqz v4, :cond_49

    .line 1329
    .line 1330
    invoke-virtual {v1, v4}, La/b4e;->b(La/b4e;)V

    .line 1331
    .line 1332
    .line 1333
    move v2, v5

    .line 1334
    const/4 v3, 0x0

    .line 1335
    goto/16 :goto_0

    .line 1336
    .line 1337
    :cond_49
    const/4 v2, 0x0

    .line 1338
    invoke-virtual {v0, v2}, La/kdx;->h(La/o6k;)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v0, v1, La/b4e;->c:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v0, La/b4e;

    .line 1344
    .line 1345
    iget-object v1, v1, La/b4e;->d:Ljava/lang/Object;

    .line 1346
    .line 1347
    check-cast v1, La/b4e;

    .line 1348
    .line 1349
    if-ne v0, v1, :cond_4a

    .line 1350
    .line 1351
    return-void

    .line 1352
    :cond_4a
    invoke-static {v0, v1}, La/kdx;->e(La/b4e;La/b4e;)V

    .line 1353
    .line 1354
    .line 1355
    return-void

    .line 1356
    nop

    .line 1357
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()C
    .locals 2

    .line 1
    iget v0, p0, La/kdx;->f:I

    .line 2
    .line 3
    iget-object v1, p0, La/kdx;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/kdx;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget p0, p0, La/kdx;->f:I

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final h(La/o6k;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/kdx;->g:La/o6k;

    .line 7
    .line 8
    :goto_0
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v2, v1, La/o6k;->e:La/o6k;

    .line 11
    .line 12
    if-eq v2, p1, :cond_0

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :goto_1
    if-eqz v1, :cond_b

    .line 17
    .line 18
    iget-object v2, v1, La/o6k;->a:La/e2q0;

    .line 19
    .line 20
    iget-char v3, v1, La/o6k;->b:C

    .line 21
    .line 22
    iget-object v4, p0, La/kdx;->c:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, La/q6k;

    .line 33
    .line 34
    iget-boolean v5, v1, La/o6k;->d:Z

    .line 35
    .line 36
    if-eqz v5, :cond_a

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_1
    invoke-interface {v4}, La/q6k;->e()C

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget-object v6, v1, La/o6k;->e:La/o6k;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    move v8, v7

    .line 50
    move v9, v8

    .line 51
    :goto_2
    if-eqz v6, :cond_3

    .line 52
    .line 53
    if-eq v6, p1, :cond_3

    .line 54
    .line 55
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    if-eq v6, v10, :cond_3

    .line 64
    .line 65
    iget-boolean v10, v6, La/o6k;->c:Z

    .line 66
    .line 67
    if-eqz v10, :cond_2

    .line 68
    .line 69
    iget-char v10, v6, La/o6k;->b:C

    .line 70
    .line 71
    if-ne v10, v5, :cond_2

    .line 72
    .line 73
    invoke-interface {v4, v6, v1}, La/q6k;->c(La/o6k;La/o6k;)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const/4 v9, 0x1

    .line 78
    if-lez v8, :cond_2

    .line 79
    .line 80
    move v5, v9

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    iget-object v6, v6, La/o6k;->e:La/o6k;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v5, v9

    .line 86
    move v9, v7

    .line 87
    :goto_3
    if-nez v9, :cond_5

    .line 88
    .line 89
    if-nez v5, :cond_4

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v3, v1, La/o6k;->e:La/o6k;

    .line 96
    .line 97
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget-boolean v2, v1, La/o6k;->c:Z

    .line 101
    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, v1}, La/kdx;->i(La/o6k;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v1, v1, La/o6k;->f:La/o6k;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget-object v3, v6, La/o6k;->a:La/e2q0;

    .line 111
    .line 112
    iget v5, v6, La/o6k;->g:I

    .line 113
    .line 114
    sub-int/2addr v5, v8

    .line 115
    iput v5, v6, La/o6k;->g:I

    .line 116
    .line 117
    iget v5, v1, La/o6k;->g:I

    .line 118
    .line 119
    sub-int/2addr v5, v8

    .line 120
    iput v5, v1, La/o6k;->g:I

    .line 121
    .line 122
    iget-object v5, v3, La/e2q0;->g:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v8, v7, v5}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iput-object v5, v3, La/e2q0;->g:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v5, v2, La/e2q0;->g:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v8, v7, v5}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iput-object v5, v2, La/e2q0;->g:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v5, v1, La/o6k;->e:La/o6k;

    .line 139
    .line 140
    :goto_4
    if-eqz v5, :cond_6

    .line 141
    .line 142
    if-eq v5, v6, :cond_6

    .line 143
    .line 144
    iget-object v7, v5, La/o6k;->e:La/o6k;

    .line 145
    .line 146
    invoke-virtual {p0, v5}, La/kdx;->i(La/o6k;)V

    .line 147
    .line 148
    .line 149
    move-object v5, v7

    .line 150
    goto :goto_4

    .line 151
    :cond_6
    if-eq v3, v2, :cond_8

    .line 152
    .line 153
    iget-object v5, v3, La/b4e;->f:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v5, La/b4e;

    .line 156
    .line 157
    if-ne v5, v2, :cond_7

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_7
    iget-object v7, v2, La/b4e;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v7, La/b4e;

    .line 163
    .line 164
    invoke-static {v5, v7}, La/kdx;->e(La/b4e;La/b4e;)V

    .line 165
    .line 166
    .line 167
    :cond_8
    :goto_5
    invoke-interface {v4, v3, v2, v8}, La/q6k;->b(La/e2q0;La/e2q0;I)V

    .line 168
    .line 169
    .line 170
    iget v3, v6, La/o6k;->g:I

    .line 171
    .line 172
    if-nez v3, :cond_9

    .line 173
    .line 174
    iget-object v3, v6, La/o6k;->a:La/e2q0;

    .line 175
    .line 176
    invoke-virtual {v3}, La/b4e;->j()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v6}, La/kdx;->i(La/o6k;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    iget v3, v1, La/o6k;->g:I

    .line 183
    .line 184
    if-nez v3, :cond_0

    .line 185
    .line 186
    iget-object v3, v1, La/o6k;->f:La/o6k;

    .line 187
    .line 188
    invoke-virtual {v2}, La/b4e;->j()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v1}, La/kdx;->i(La/o6k;)V

    .line 192
    .line 193
    .line 194
    move-object v1, v3

    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_a
    :goto_6
    iget-object v1, v1, La/o6k;->f:La/o6k;

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_b
    :goto_7
    iget-object v0, p0, La/kdx;->g:La/o6k;

    .line 202
    .line 203
    if-eqz v0, :cond_c

    .line 204
    .line 205
    if-eq v0, p1, :cond_c

    .line 206
    .line 207
    invoke-virtual {p0, v0}, La/kdx;->i(La/o6k;)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_c
    return-void
.end method

.method public final i(La/o6k;)V
    .locals 2

    .line 1
    iget-object v0, p1, La/o6k;->e:La/o6k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p1, La/o6k;->f:La/o6k;

    .line 6
    .line 7
    iput-object v1, v0, La/o6k;->f:La/o6k;

    .line 8
    .line 9
    :cond_0
    iget-object p1, p1, La/o6k;->f:La/o6k;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iput-object v0, p0, La/kdx;->g:La/o6k;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iput-object v0, p1, La/o6k;->e:La/o6k;

    .line 17
    .line 18
    return-void
.end method
